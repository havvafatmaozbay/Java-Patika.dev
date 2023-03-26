import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
      int a=0, b=1, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Series Number: ");
        n= scanner.nextInt();


        for(int i = 0; i<n; i++){
            System.out.println(a);
            c = a + b;
            a = b;
            b=c;

        }

        System.out.println(a);


    }
}