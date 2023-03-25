import java.util.Scanner;

public class Main {

    public static double HarmonicNumber(int n){
        if(n==0){
            return 0;
        }
        return (1.0/n) + HarmonicNumber(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(HarmonicNumber(n));

    }
}