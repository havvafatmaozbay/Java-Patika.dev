import java.util.Scanner;

public class Player {
    private Scanner input = new Scanner(System.in); //Sadece bu sınıf içerisinde kullanacağımız için private tanımladık

    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    private Inventory inventory;
    private int defaultHealth;

    Player( String name){
        this.name=name;
        this.setInventory(new Inventory());
    }
    public void selectChar(){


        GameCharacter[] charlist = {new Samurai(), new Archer(), new Knight()};
        System.out.println("Characters");
        System.out.println("-------------------------------");
        for(GameCharacter gameCharacter : charlist){
            System.out.println("ID: "+gameCharacter.getId()+
                    "\t Character: " + gameCharacter.getName()+
                    "\t Damage: "+gameCharacter.getDamage()+
                    "\t Health: "+gameCharacter.getHealth()+
                    "\t Money: "+gameCharacter.getMoney());
        }
        System.out.println("-------------------------------");
        System.out.print( "Please select character ID: ");
        int selectChar = input.nextInt();
        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
                break;

        }
        System.out.println("Character Name :"
                +this.getCharName()+", Damage :"
                +this.getDamage()+", Health :"
                +this.getHealth()+", Money :"
                +this.getMoney());
    }
    public void selectLocation(){
        Location loc = null;
        Location[] locationList = {new SafeHouse(this), new ToolStore(this)};
        System.out.println("Locations:");
        System.out.println("-------------------------------");
        for(Location location : locationList){
            System.out.println("ID: "+location.getId()+
                    "\t Location: " + location.getName());
        }
        System.out.print("Please Select the Location ID:");
        int selectLoc = input.nextInt();
        switch (selectLoc){
            case 1:
                loc = new SafeHouse(this);
                break;
            case 2:
                loc = new ToolStore(this);
                break;
            default:
                loc = new SafeHouse(this);

        }
        System.out.println("Location ID :"
                +loc.getId()+", Location Name :"
                +loc.getName());
        loc.onLocation();

    }
    public void initPlayer(GameCharacter gameCharacter){
        this.setCharName(gameCharacter.getName());
        this.setDamage(gameCharacter.getDamage());
        this.setDefaultHealth(gameCharacter.getHealth());
        this.setMoney(gameCharacter.getMoney());
    }
    public void playerInfo(){
        System.out.println("Your Weapon : " +this.getInventory().getWeapon().getName()+
                ", Your Armor :" +this.getInventory().getArmor().getName() +
                ", Damage :" +this.getTotalDamage()+
                ", Health : " +this.getHealth()+
                ", Money : " +this.getMoney());
    }
    public int getDamage() {
        return damage;
    }
    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCharName(){
        return this.charName;
    }
    public void setCharName(String charName){
        this.charName=charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Weapons getWeapon(){
        return this.getInventory().getWeapon();
    }
    public Armors getArmor(){
        return this.getInventory().getArmor();
    }

    public int getDefaultHealth() {
        return defaultHealth;
    }

    public void setDefaultHealth(int defaultHealth) {
        this.defaultHealth = defaultHealth;
    }
}
