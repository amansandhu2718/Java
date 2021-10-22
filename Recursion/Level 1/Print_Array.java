import java.util.Scanner;

public class Print_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Display(arr, 0);
    }

    public static void Display(int arr[], int vidx) {

        if (vidx == arr.length) {
            return;
        }
        System.out.print(arr[vidx] + "\t");
        Display(arr, vidx + 1);
    }
}
