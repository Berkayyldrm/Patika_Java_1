import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game, int pos, boolean[] testPos) {
        if (pos < 0 ) return false;
        if (pos >= game.length) return true;
        if (game[pos] == 1) return false;
        if(testPos[pos]) return false;
        testPos[pos] = true;
        return canWin(leap, game, pos+leap, testPos)
                || canWin(leap, game, pos+1, testPos)
                || canWin(leap, game, pos-1, testPos);

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

            System.out.println( (canWin(leap, game, 0, new boolean[game.length])) ? "YES" : "NO" );
        }
        scan.close();
    }
}
