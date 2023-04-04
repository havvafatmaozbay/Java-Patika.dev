import java.util.PropertyResourceBundle;

public class Main {
    public static void main(String[] args) {
        Brand.brands.add(new Brand("Apple"));
        Brand.brands.add(new Brand("Xiaomi"));

        SmartPhone.smartPhones.add(new SmartPhone(27000,"Iphone 13",new Brand("Apple"),
                128,6.7,4,"Pink",35));
        SmartPhone.smartPhones.add(new SmartPhone(20000,"Xiaomi Note 11",new Brand("Xiaomi"),
                256,6.0,4,"Dark Gray",29));

        Notebook.notebooks.add(new Notebook(21999,"Mac M2",new Brand("Apple"),256,
                13.4,8));

        Product.products.addAll(SmartPhone.smartPhones);
        Product.products.addAll(Notebook.notebooks);

        UserPanel userPanel = new UserPanel();
        userPanel.menu();


    }
}