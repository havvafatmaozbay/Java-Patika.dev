import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n;
        int num;
        System.out.print("Please Enter How many number you want to add: ");
        Scanner scanner = new Scanner(System.in);
        n= scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<n; i++){
            System.out.print("Please enter next number: ");
            num = scanner.nextInt();
            list.add(num);
        }
        list.sort(Comparator.naturalOrder());
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }
        System.out.println("Greatest number in List is: " + list.get(n-1));
        System.out.println("Minimum number in List is: "+ list.get(0));
    }
}