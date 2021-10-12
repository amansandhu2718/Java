
import java.util.*;

public class Spiral_traversal {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int minr = 0, maxr = arr.length - 1;
        int minc = 0, maxc = arr[0].length - 1;
        int count = 0;
        int lim = n * m;
        while (count < lim) {

            // left wall
            for (int i = minr, j = minc; i <= maxr && count < lim; i++) {
                System.out.println(arr[i][j]);
                count++;

            }
            minc++;
            // bottomwall

            for (int i = maxr, j = minc; j <= maxc && count < lim; j++) {
                System.out.println(arr[i][j]);
                count++;

            }
            maxr--;
            // rightwall
            for (int i = maxr, j = maxc; i >= minr && count < lim; i--) {
                System.out.println(arr[i][j]);
                count++;

            }
            maxc--;
            // topwall
            for (int i = minr, j = maxc; j >= minc && count < lim; j--) {
                System.out.println(arr[i][j]);
                count++;

            }
            minr++;
        }

    }

}