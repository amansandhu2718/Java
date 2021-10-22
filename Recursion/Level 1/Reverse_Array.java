import java.util.Scanner;
//method 1


// public class Reverse_Array {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int arr[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = scn.nextInt();
//         }
//         Display(arr, n-1);
//     }

//     public static void Display(int arr[], int vidx) {

//         if (vidx < 0) {
//             return;
//         }
//         System.out.print(arr[vidx] + "\t");
//         Display(arr, vidx - 1);
//     }
    
// }

//method 2
public class Reverse_Array {
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
        }Display(arr, vidx + 1);
        System.out.print(arr[vidx] + "\t");
        
    }
}

