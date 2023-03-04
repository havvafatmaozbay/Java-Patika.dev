import java.util.Scanner;

public class Main {
    static int method(int n,int temp){


        if(n>0){
            n=n-5;
            System.out.println(n);

        }
        else if(n<=0){
            for(int dummy = n; dummy <= temp; dummy ++) {
                n=n+5;
                System.out.println(n);
                dummy +=5;

            }
            if(n==temp){
                return n;
            }



        }

        return method(n,temp);

    }





    public static void main(String[] args) {
        System.out.println("N Sayısı :");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        method(input,input);

    }
}