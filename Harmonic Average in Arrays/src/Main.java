public class Main {

    public static void main(String[] args) {
        int[] list = {1,4,6,3,8};
        calcAverage(list);
        calcHarmonicAverage(list);
    }
    public static void calcAverage(int[] list){

        double average = 0.0;
        double total=0;

        for(int i = 0; i<list.length; i++){
            total += list[i];
        }
        System.out.println(total);
        average = total / list.length;
        System.out.println(average);

    }
    public static void calcHarmonicAverage(int[] list){
        double harmonicsum =0.0;
        double harmonicAverage = 0.0;
        for(int i=0; i<list.length;i++){
            harmonicsum += 1/list[i];

        }
        System.out.println("Harmonic Sum :" +harmonicsum);
        harmonicAverage = list.length/harmonicsum;
        System.out.println("Harmonic Average :"+ harmonicAverage);
    }
}