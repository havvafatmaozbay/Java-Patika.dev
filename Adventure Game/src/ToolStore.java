public class ToolStore extends NormalLocation{
    public ToolStore(Player player){
        super(2,player,"Store");
    }
    @Override
    public boolean onLocation(){
        System.out.println("Welcome to the store");
        boolean showMenu = true;
        while(showMenu){
            System.out.println("1- Weapons");
            System.out.println("2- Armors");
            System.out.println("3- Exit");
            System.out.print("Your choice: ");
            int selectTool = Location.input.nextInt();
            while (selectTool <1 || selectTool >3 ){
                System.out.println("Invalid choice, Please Select Tool: ");
                selectTool = Location.input.nextInt();
            }
            switch (selectTool){
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Good Bye!");
                    showMenu = false;
                    break;
            }

        }

        return true;
    }
    public void printWeapon(){
        System.out.println("------Weapons------");
        for(Weapons w :Weapons.weapons()){
            System.out.println(w.getName()+ " <ID :" + w.getId() + ", Money : "+w.getPrice() + ", Damage :" +w.getDamage() +">");
        }
        System.out.println("0- Exit");
    }
    public void buyWeapon(){
        System.out.print("Please Select a Weapon: ");

        int selectWeaponID = input.nextInt();
        while(selectWeaponID <0 || selectWeaponID > Weapons.weapons().length){
            System.out.println("Invalid Choice, Select Again: ");
            selectWeaponID = input.nextInt();
        }
        if(selectWeaponID != 0){
            Weapons selectedWeapon = Weapons.getWeaponObjByID(selectWeaponID);

            if(selectedWeapon!= null){
                if(selectedWeapon.getPrice() > this.getPlayer().getMoney()){
                    System.out.println("You do not have enough money to buy this item!");
                }else{
                    // Buying Process
                    System.out.println(selectedWeapon.getName()+" bought.");
                    this.getPlayer().setMoney(this.getPlayer().getMoney()-selectedWeapon.getPrice());
                    System.out.println("Your balance :" +this.getPlayer().getMoney());
                    System.out.println("Your former weapon: "+this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Your New Weapon :" +this.getPlayer().getInventory().getWeapon().getName());
                }

            }

        }


    }
    public void printArmor(){
        System.out.println("------Armors------");
        for(Armors a :Armors.armors()){
            System.out.println(a.getName()+
                    " <ID :" + a.getId() +
                    ", Money : "+a.getPrice() + "" +
                    ", Block :" +a.getBlock() +">");
        }
        System.out.println("0- Exit");
    }
    public void buyArmor(){
        System.out.print("Please Select a Armor: ");

        int selectedArmorID = input.nextInt();
        while(selectedArmorID <0 || selectedArmorID > Weapons.weapons().length){
            System.out.println("Invalid Choice, Select Again: ");
            selectedArmorID = input.nextInt();
        }
        if(selectedArmorID!= 0){
            Armors selectedArmor = Armors.getArmorObjByID(selectedArmorID);

            if(selectedArmor!= null){
                if(selectedArmor.getPrice() > this.getPlayer().getMoney()){
                    System.out.println("You do not have enough money to buy this item!");
                }else{
                    // Buying Process
                    System.out.println(selectedArmor.getName()+" bought.");
                    this.getPlayer().setMoney(this.getPlayer().getMoney()-selectedArmor.getPrice());
                    System.out.println("Your balance :" +this.getPlayer().getMoney());
                    System.out.println("Your former Armor: "+this.getPlayer().getInventory().getArmor().getName());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Your New Armor :" +this.getPlayer().getInventory().getArmor().getName());
                }

            }


        }

    }
}
