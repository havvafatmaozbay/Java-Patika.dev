import java.util.Set;
import java.util.TreeSet;

public class SmartPhone extends Product{
    private String color;
    private int batteryPower;
    public static Set<SmartPhone> smartPhones = new TreeSet<>();



    public SmartPhone( int price,  String name, Brand brand, int memoryInfo, double screenSize, int ram, String color, int batteryPower) {
        super(price, name, brand, memoryInfo, screenSize, ram,1);
        this.color=color;
        this.batteryPower=batteryPower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }
}
