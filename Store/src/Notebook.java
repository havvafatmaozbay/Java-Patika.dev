import java.util.Set;
import java.util.TreeSet;

public class Notebook extends Product{
    public static Set<Notebook> notebooks = new TreeSet<>();
    public Notebook( int price,  String name, Brand brand, int memoryInfo, double screenSize, int ram) {
        super( price,  name, brand, memoryInfo, screenSize, ram, 2);
    }
}
