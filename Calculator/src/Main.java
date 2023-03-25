import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2,choice;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter First Number: ");
        n1=scanner.nextInt();
        System.out.print("Please Enter Second Number: ");
        n2=scanner.nextInt();

        while(true){
            System.out.println("1-Add\n" +
                    "2-Extract\n" +
                    "3-Multiply\n" +
                    "4-Divide\n" +
                    "0-Exit");

            System.out.print("Please Enter Your Choice: ");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Addition :" + (n1+n2));
                    break;
                case 2:
                    System.out.println("Extraction :" + (n1-n2));
                    break;
                case 3:
                    System.out.println("Multiplication :" + (n1*n2));
                    break;
                case 4:
                    System.out.println("Divide :" + (n1/n2));
                    break;
                case 0:
                    return;
            }
        }


    }
}