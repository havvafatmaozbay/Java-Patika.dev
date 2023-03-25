import java.util.Scanner;

public class Main {
    public static int Exponential(int n, int r){
        if(r==0){
            return 1;
        }
        return n*Exponential(n,r-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int r= scanner.nextInt();

        int result = Exponential(n,r);
        System.out.println(result);

    }
}