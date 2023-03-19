public class Inventory {
    private Weapons weapon;
    private Armors armor;


    Inventory(){
        this.setWeapon(new Weapons(0,0,0,"Fist"));
        this.setArmor(new Armors(0,0,0,"Fist"));
    }


    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public Armors getArmor(){
        return armor;
    }

    public void setArmor(Armors armor) {
        this.armor = armor;
    }
}
