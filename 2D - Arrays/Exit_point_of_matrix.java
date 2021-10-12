import java.util.*;

public class Exit_point_of_matrix {

    public static void main(String[] args) throws Exception {
        // The player moves in the same direction
        // as long as he meets '0'. On seeing a 1,
        // he takes a 90 deg right turn.

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int i = 0;
        int j = 0;
        int dir = 0;
        while (true) {
            dir = (dir + arr[i][j]) % 4;
            if (dir == 0) {
                j++;
                if (j == arr[0].length) {
                    j--;
                    break;
                }
            } else if (dir == 1) {
                i++;

                if (i == arr.length) {
                    i--;
                    break;
                }
            } else if (dir == 2) {
                j--;

                if (j == -1) {
                    j++;
                    break;
                }
            } else {
                i--;

                if (i == -1) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(i);
        System.out.println(j);
    }

}