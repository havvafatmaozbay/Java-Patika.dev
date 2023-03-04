import java.util.Scanner;

public class Main {
    static String prime(int number, int i){
        if(i==1){
            return number + "Sayısı Asaldır";

        }else{
            if(number%i == 0){
                return number + "Sayısı Asal Değildir";
            }
        }

    return prime(number, i-1);
    }
    public static void main(String[] args) {
        System.out.println("Sayı Giriniz:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(prime(input,input-1));
    }
}