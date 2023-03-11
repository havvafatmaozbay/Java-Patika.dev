import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {56,34,1,8,101,-2,-33};
        findMinMax(arr);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        findMinMaxToNumber(arr,number);

    }
    public static void findMinMax(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
    public static void findMinMaxToNumber(int arr[], int num){
        int min = arr[0];
        int max = arr[0];
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i= 0; i<arr.length; i++){
            if (arr[i] <num) {
                min = arr[i];
            }
            if(arr[i] > num){
                max = arr[i];
                break;
            }
        }
        System.out.println(min);
        System.out.println(max);


    }
}