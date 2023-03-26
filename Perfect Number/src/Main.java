import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        int sum =0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        num = scanner.nextInt();
        if(num != 1 && num != 0){
            for(int i = 1; i<num ; i++ ){
                if(num%i == 0){
                    sum+= i;
                }
            }
        }

        if(sum == num){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not Perfecct Number");
        }
    }
}