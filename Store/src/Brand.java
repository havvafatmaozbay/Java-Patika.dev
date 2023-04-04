import java.util.Set;
import java.util.TreeSet;

public class Brand implements Comparable<Brand>{
    private static int idCounter=0;
    private int id;
    private String brandName;
    public static Set<Brand> brands = new TreeSet<>();

    public Brand( String brandName){
        this.id = getIdCounter();
        this.brandName=brandName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getIdCounter() {
        return idCounter++;
    }

    public void setIdCounter(int idCounter) {
        this.idCounter = idCounter;
    }

    @Override
    public int compareTo(Brand o) {
        return this.getId()-o.getId();
    }
}
