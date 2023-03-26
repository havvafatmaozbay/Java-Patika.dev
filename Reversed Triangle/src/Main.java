import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int digitNum;
        int temp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter digit number: ");
        digitNum=scanner.nextInt();
        temp = digitNum;
        while(digitNum>=0){
            for(int k = 0; k <temp-digitNum; k++){
                System.out.print(" ");
            }

            for(int i = (digitNum*2)-1; i>0; i--){
                System.out.print("*");
            }
            digitNum--;

            System.out.println();
        }

    }
}