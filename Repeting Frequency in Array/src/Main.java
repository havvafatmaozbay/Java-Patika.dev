public class Main {
    public static boolean hasNumber(int[] list, int value){
        for(int i:list){
            if(i==value){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int [] temp = new int[list.length];
        System.out.println("Repeating Numbers");
        for(int i= 0; i<list.length; i++){
            int count = 0;
            for(int j = 0; j<list.length; j++){
                if (list[i]==list[j]) {
                    count++;
                    if(hasNumber(temp,list[i])){
                        temp[i] = list[i];
                    }
                }
            }
            if(temp[i]!=0){
                System.out.println(temp[i]+" Sayısı "+count+" kere tekrar edildi." );
            }

        }
    }
}