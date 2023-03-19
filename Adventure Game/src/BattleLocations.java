import java.util.Random;

public abstract class BattleLocations extends Location{
    private int battleLocID;
    private Monster monster;
    private String award;
    private int maxMonsterNumber;

    public BattleLocations(Player player, String name, Monster monster, String award, int battleLocID, int maxMonsterNumber){
        super(battleLocID,player,name);
        this.setMonster(monster);
        this.setAward(award);
        this.setMaxMonsterNumber(maxMonsterNumber);

    }
    @Override
    public boolean onLocation(){
        int monsterNumber = this.randomMonsterNumber();
        System.out.println("Your Location :"+this.getName());
        System.out.println("Be carefull! " + monsterNumber+ " "+ this.getMonster().getName() + " lives here!");
        System.out.print("<W>AR or <R>UN");
        String selectedChar = input.nextLine();
        selectedChar = selectedChar.toUpperCase();
        if(selectedChar.equals("W")){
            //War Process
            System.out.println("Battle will start!");
            if(combat(maxMonsterNumber)){
                System.out.println("YOU BEAT THE MONSTERS");
                return true;
            }

        }
        if(this.getPlayer().getHealth()<0){
            System.out.println("YOU LOST!");
            return false;
        }
        return true;
    }
    public boolean combat(int maxMonsterNumber){
       this.getMonster().setHealth(this.getMonster().getDefaultHealth());
        for(int i=1; i<= maxMonsterNumber ;i++){
            playerStats();
            monsterStats(i);
            while(this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0){
                System.out.println("<H>IT or <R>UN");
                String selectCombat = input.nextLine().toUpperCase();
                if(selectCombat.equals("H")){
                    System.out.println("You HIT!");
                    this.getMonster().setHealth(this.getMonster().getHealth()-this.getPlayer().getTotalDamage());
                    afterHit();
                    if(this.getMonster().getHealth() > 0){
                        System.out.println("Monster HITS!");
                        int monsterDamage = this.getMonster().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if(monsterDamage <0 ){
                            monsterDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth()-monsterDamage);
                        afterHit();
                    }

                }else{
                    return false;
                }

            }
            if(this.getMonster().getHealth() < this.getPlayer().getHealth()){
                System.out.println("You defeat the "+ this.getMonster().getName());
                System.out.println(this.getMonster().getBonus() + " Earned");
                this.getPlayer().setMoney(this.getPlayer().getMoney()+this.getMonster().getBonus());
                System.out.println("Current Balance :" + this.getPlayer().getMoney());
            }

        }
        return true;
    }
    public void playerStats(){
        System.out.println("Player Status: ");
        System.out.println("------------------------------");
        System.out.println("Health :" +this.getPlayer().getHealth());
        System.out.println("Weapon :" + this.getPlayer().getWeapon().getName());
        System.out.println("Damage :" +this.getPlayer().getTotalDamage());
        System.out.println("Armor :" + this.getPlayer().getArmor().getName());
        System.out.println("Block :" + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Money :" + this.getPlayer().getMoney());

    }
    public void monsterStats(int i ){
        System.out.println(i + "."+" Monster Status");
        System.out.println("------------------------------");
        System.out.println("Name :" +this.getMonster().getName());
        System.out.println("Health :" +this.getMonster().getHealth());
        System.out.println("Damage :"+ this.getMonster().getDamage());
        System.out.println("Bonus :"+this.getMonster().getBonus());
    }
    public void afterHit(){
        System.out.println("Your Health :"+ this.getPlayer().getHealth());
        System.out.println(this.getMonster().getName()+" Health :"+this.getMonster().getHealth());
    }
    public int randomMonsterNumber(){
        Random r = new Random();
        return r.nextInt(this.getMaxMonsterNumber()) +1;
    }
    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getBattleLocID() {
        return battleLocID;
    }

    public void setBattleLocID(int battleLocID) {
        this.battleLocID = battleLocID;
    }

    public int getMaxMonsterNumber() {
        return maxMonsterNumber;
    }

    public void setMaxMonsterNumber(int maxMonsterNumber) {
        this.maxMonsterNumber = maxMonsterNumber;
    }
}
