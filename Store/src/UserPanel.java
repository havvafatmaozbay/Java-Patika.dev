import java.util.Formatter;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UserPanel {
    Scanner scanner = new Scanner(System.in);
    int choice;

    void menu(){
        while(true){
            System.out.println("Product Management Panel");
            System.out.println("1-List Notebook");
            System.out.println("2-List Smart Phone");
            System.out.println("3-List Brands");
            System.out.println("4-Add Product");
            System.out.println("5-Delete Product");
            System.out.println("0-Exit");
            System.out.print("Your Choice : ");
            choice= scanner.nextInt();

            switch (choice){
                case 1:
                    listNotebook();
                    break;
                case 2:
                    listSmartphone();
                    break;
                case 3:
                    listBrands();
                    break;
                case 4:
                    addProduct();
                    break;
                case 5:
                    deleteProduct();
                    break;
                case 0:
                    return;


            }

        }
    }
    void deleteProduct(){
        System.out.println("Please select product group you want to delete");
        System.out.println("1- Smart Phone");
        System.out.println("2- Notebook");
        System.out.println("0- Main Menu");
        System.out.println("9- Exit");
        System.out.print("Your selection :");
        int selectionAdd = scanner.nextInt();
        switch (selectionAdd){
            case 1:
                deleteSmartPhone();
                break;
            case 2:
                deleteNotebook();
                break;
            case 0:
                menu();
                break;
            case 9:
                return;
        }


    }
    void deleteNotebook(){
        Set<Notebook> temp = new TreeSet<>();
        System.out.println("NoteBook ID's :");
        System.out.println("-------------------------");
        for(Notebook n: Notebook.notebooks){
            System.out.println("ID :" + n.getID());
        }
        System.out.print("Please Enter the ID Number of the Smart Phone");
        int deletedid = scanner.nextInt();
        for(Notebook n: Notebook.notebooks){
            if(n.getID()==deletedid){
                temp.add(n);
            }
        }
        Notebook.notebooks.removeAll(temp);
        Product.products.removeAll(temp);

    }
    void deleteSmartPhone(){
        Set<SmartPhone> temp = new TreeSet<>();
        System.out.println("SmartPhone ID's :");
        System.out.println("-------------------------");
        for(SmartPhone s: SmartPhone.smartPhones){
            System.out.println("ID :" + s.getID());
        }
        System.out.print("Please Enter the ID Number of the Smart Phone");
        int deletedid = scanner.nextInt();
        for(SmartPhone s: SmartPhone.smartPhones){
            if(s.getID()==deletedid){
                temp.add(s);
            }
        }
        SmartPhone.smartPhones.removeAll(temp);
        Product.products.removeAll(temp);


    }
    void addNoteBook(){
        System.out.print("Please Enter the Notebook  Name :");
        String notebookName = scanner.next();
        System.out.print("Please Enter the Brand :");
        String notebookBrand = scanner.next();
        System.out.print("Please Enter the Price :");
        int notebookPrice = scanner.nextInt();
        System.out.print("Please Enter the Storage :");
        int notebookStorage = scanner.nextInt();
        System.out.print("Please enter the Screen Size :");
        double notebookScreen = scanner.nextInt();
        System.out.print("Please Enter the Battery Capacity :");
        int notebookBattery = scanner.nextInt();
        System.out.println("Please Enter the RAM :");
        int noteBookRam = scanner.nextInt();

        Notebook.notebooks.add(new Notebook(notebookPrice,notebookName, new Brand(notebookBrand),notebookStorage,notebookScreen,noteBookRam));
        Product.products.addAll(Notebook.notebooks);

        System.out.println("NoteBook Added");
        System.out.println("--------------------------");
        listNotebook();


    }
    void addSmartPhone(){
        System.out.print("Please Enter the Smart Phone Name :");
        String phoneName = scanner.next();
        System.out.print("Please Enter the Brand :");
        String phoneBrand = scanner.next();
        System.out.print("Please Enter the Price :");
        int phonePrice = scanner.nextInt();
        System.out.print("Please Enter the Storage :");
        int phoneStorage = scanner.nextInt();
        System.out.print("Please enter the Screen Size :");
        double phoneScreenSize = scanner.nextInt();
        System.out.print("Please Enter the Battery Capacity :");
        int phoneBattery = scanner.nextInt();
        System.out.print("Please Enter the RAM :");
        int phoneRam = scanner.nextInt();
        System.out.print("Please Enter the Color :");
        String phoneColor = scanner.next();

        SmartPhone.smartPhones.add(new SmartPhone(phonePrice,phoneName,new Brand(phoneBrand),phoneStorage,phoneScreenSize,phoneRam,phoneColor,phoneBattery));
        Product.products.addAll(SmartPhone.smartPhones);

        System.out.println("Smart Phone Added");
        System.out.println("--------------------------");

        listSmartphone();

        /*if(Product.products.contains(temp)){
            System.out.print("This Product is already on the system. Would you like to change stock number? Y/N");
            String answer = scanner.nextLine();
            switch (answer){
                case "Y":
                    Product.products.
                    System.out.println("New Stock Amount :" + p.getAmount());
                    break;
                case "N":
                    System.out.println("Directing to Main Menu :");
                    menu();
                    break;
            }
        }*/


    }

    void addProduct(){
        System.out.println("Please select product group you want to add");
        System.out.println("1- Smart Phone");
        System.out.println("2- Notebook");
        System.out.println("0- Main Menu");
        System.out.println("9- Exit");
        System.out.print("Your selection :");
        int selectionAdd = scanner.nextInt();
        switch (selectionAdd){
            case 1:
                addSmartPhone();
                break;
            case 2:
                addNoteBook();
                break;
            case 0:
                menu();
                break;
            case 9:
                return;
        }

    }
    void listBrands(){
        System.out.println("Brands ");
        System.out.println("--------------------");
        for(Brand b: Brand.brands){
            System.out.println("-"+b.getBrandName());
        }
    }
    void listSmartphone() {
        System.out.println("Smart Phones: ");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-4s|%-21s|%-18s|%-20s|%-15s|%-15s|%-15s|%-10s|%-15s|\n", "ID", "Product Name", "Price", "Brand", "Storage",
                "Screen Size", "Battery", "Ram", "Color");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");

        for (SmartPhone s : SmartPhone.smartPhones) {
            System.out.printf("|%-4s|%-21s|%-18s|%-20s|%-15s|%-15s|%-15s|%-10s|%-15s|\n",
                    s.getID(), s.getName(), s.getPrice(), s.getBrand().getBrandName(), s.getMemoryInfo(),
                    s.getScreenSize(), s.getBatteryPower(), s.getRam(), s.getColor());
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");

        }
    }


    void listNotebook() {
        System.out.println("Notebooks :");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-4s|%-21s|%-18s|%-20s|%-15s|%-15s|%-10s|\n", "ID", "Product Name", "Price", "Brand", "Storage",
                "Screen Size", "Ram");
        System.out.println("-------------------------------------------------------------------------------------------------------------");

        for (Notebook n : Notebook.notebooks) {
            System.out.printf("|%-4s|%-21s|%-18s|%-20s|%-15s|%-15s|%-10s|\n",
                    n.getID(), n.getName(), n.getPrice(), n.getBrand().getBrandName(), n.getMemoryInfo(),
                    n.getScreenSize(), n.getRam());
            System.out.println("-------------------------------------------------------------------------------------------------------------");

        }

    }
}
