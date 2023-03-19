import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int count = 0;
        int sum = 0;
        int[] array = new int[n];
        for(int i = 0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        for(int j= 0; j<array.length; j++){
            if(array[j] < 0){
                count++;
            }
        }
        for(int k= 0; k<array.length; k++){
            sum+= array[k];
            if(sum <0 ){
                count++;
            }
        }
        System.out.println(count);
    }
}