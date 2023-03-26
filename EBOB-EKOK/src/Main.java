import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter First Number: ");
        n1= scanner.nextInt();
        System.out.print("Please Enter Second Number: ");
        n2=scanner.nextInt();

        int i = n1;
        int ebob = 0;

        while(i<=n1){
            if(n1%i == 0 && n2%i==0){
                ebob=i;
                break;
            }
            i--;
        }
        System.out.println("EBOB is: "+ebob);
        System.out.println("EKOK is: "+ (n1*n2)/ebob);

    }
}