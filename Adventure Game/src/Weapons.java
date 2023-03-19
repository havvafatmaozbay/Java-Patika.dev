public class Weapons {
    private int id;
    private String name;
    private int damage;
    private int price;

    public Weapons(int id, int damage, int price , String name){
        this.setId(id);
        this.setDamage(damage);
        this.setPrice(price);
        this.setName(name);
    }
    public static Weapons[] weapons(){
        Weapons[] weaponList = new Weapons[3];
        weaponList[0] = new Weapons(1,2,25,"Gun");
        weaponList[1] = new Weapons(2,3,35,"Sword");
        weaponList[2] = new Weapons(3,7,45,"Rifle");
        return weaponList;
    }
    public static Weapons getWeaponObjByID(int id){

        for(Weapons w : Weapons.weapons()){
            if (w.getId() == id){
               return  w;
            }
        }
        return null;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
