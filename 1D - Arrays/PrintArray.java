import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=scn.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();
        }
        System.out.println("----------- Printing... ----------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
   
    }
}
