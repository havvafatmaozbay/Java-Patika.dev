import java.util.Scanner;

public class Main {

    public static int Factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*Factorial(n-1);
    }
    public static void main(String[] args) {
        int n,r;
        int nFac,rFac,nrFac;
        int combination;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter n: ");
        n=scanner.nextInt();
        System.out.print("Please Enter r: ");
        r=scanner.nextInt();

        nFac = Factorial(n);
        rFac = Factorial(r);
        nrFac = Factorial(n-r);

        combination = nFac/(rFac*nrFac);
        System.out.println("Combination is : " + combination);





    }
}