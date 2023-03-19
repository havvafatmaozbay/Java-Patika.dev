public class Armors {
    private int id;
    private int block;
    private int price;
    private String name;

    public Armors(int id, int block, int price , String name){
        this.id= id;
        this.block=block;
        this.price=price;
        this.name = name;
    }
    public static Armors[] armors(){
        Armors[] armorList = new Armors[3];
        armorList[0] = new Armors(1,1,15,"Light");
        armorList[1] = new Armors(2,3,25,"Medium");
        armorList[2] = new Armors(3,5,40,"Heavy");
        return armorList;
    }
    public static Armors getArmorObjByID(int id){

        for(Armors a : Armors.armors()){
            if (a.getId() == id){
                return  a;
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

    public int getBlock() {
        return block;
    }

    public void setBlock(int damage) {
        this.block = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
