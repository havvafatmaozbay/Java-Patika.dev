import java.util.Set;
import java.util.TreeSet;

public abstract class Product implements Comparable<Product>{
    private static int idCount=0;
    private int ID;
    private int price;
    private double discountRate;
    private int amount;
    private String name;
    private Brand brand;
    private int memoryInfo;
    private double screenSize;
    private int ram;
    private int productGroupID;
    public static Set<Product> products = new TreeSet<>();

    public Product(int price,String name,Brand brand,int memoryInfo, double screenSize, int ram, int productGroupID){
        this.ID=getIdCount();
        this.price=price;
        this.discountRate=0;
        this.amount=50;
        this.name=name;
        this.brand=brand;
        this.memoryInfo=memoryInfo;
        this.screenSize=screenSize;
        this.ram=ram;
        this.productGroupID=productGroupID;

    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getMemoryInfo() {
        return memoryInfo;
    }

    public void setMemoryInfo(int memoryInfo) {
        this.memoryInfo = memoryInfo;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getProductGroupID() {
        return productGroupID;
    }

    public void setProductGroupID(int productGroupID) {
        this.productGroupID = productGroupID;
    }

    public int getIdCount() {
        return idCount++;
    }

    public void setIdCount(int idCount) {
        this.idCount = idCount;
    }

    @Override
    public int compareTo(Product o) {
        return this.getID()-o.getID();
    }
}
