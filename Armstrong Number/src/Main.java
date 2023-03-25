import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        int temp;
        int digitNum=0;
        int counter=0;
        int sum=0;

        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        temp = num;
        while(temp != 0){
            temp = temp/10;
            counter++;
        }
        temp = num;
        while(temp != 0){
            digitNum = temp%10;
            sum += (int)Math.pow(digitNum,counter);
            temp /=10;

        }
        if(sum == num){
            System.out.println("Armstrong Number!");
        }else{
            System.out.println("Not Armstrong Number!");
        }
        System.out.println(sum);


    }
}