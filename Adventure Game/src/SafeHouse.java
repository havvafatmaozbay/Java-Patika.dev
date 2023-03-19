public class SafeHouse extends NormalLocation{
    private int id;
    public SafeHouse(Player player){
        super(1,player,"Safe House");
    }
    @Override
    public boolean onLocation(){
        System.out.println("You are at Safe House");
        System.out.println("Your Health Refilled");
        this.getPlayer().setHealth(this.getPlayer().getDefaultHealth());
        return true;
    }
}
