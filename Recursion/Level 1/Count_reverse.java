import java.util.Scanner;

public class Count_reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        fun(n);
    }

    public static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);// pre-area
        fun(n - 1);// mid-area

    }
}
