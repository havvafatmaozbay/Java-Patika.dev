import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,7,3,3,2,9,10,21,1,33,9,1,2};
        findRepeatingNum(arr);
        finRepeatingEvenNum(arr);


    }
    public static boolean hasTemp(int[] arr, int value){
        for(int i : arr){
            if(i==value){
                return false;
            }
        }
        return true;

    }
    public static void findRepeatingNum(int arr[]){

        int[] temp = new int[arr.length];
        int startIndex = 0;
        for(int i= 0; i<arr.length; i++){
            for(int j= 0; j<arr.length; j++){
                if(i!=j && arr[i] == arr[j]){
                    if(hasTemp(temp,arr[i])){
                        temp[startIndex++]=arr[i];
                        break;
                    }


                }
            }
        }
        System.out.println(Arrays.toString(temp));

    }
    public static void finRepeatingEvenNum(int [] arr){

        int[] temp = new int[arr.length];
        int startIndex = 0;
        for(int i= 0; i<arr.length; i++){
            for(int j= 0; j<arr.length; j++) {
                if (arr[i] % 2 == 0) {
                    if (i != j && arr[i] == arr[j]) {
                        if (hasTemp(temp, arr[i])) {
                            temp[startIndex++] = arr[i];
                            break;
                        }


                    }
                }
            }
        }
        System.out.println(Arrays.toString(temp));

    }
}