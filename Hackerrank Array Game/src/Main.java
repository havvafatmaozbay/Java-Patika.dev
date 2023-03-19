import java.util.*;

public class Main {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int N = game.length;
        for(int i = 0; i< N; i++){
            if(i < 0 || game[i] == 1){
                return false;
            }
            if(i == N - 1 || i + leap >= N){
                return true;
            }
        }
       return canWin(leap,game);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game) ? "YES" : "NO" ));
        }
        scan.close();
    }
}