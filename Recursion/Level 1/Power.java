import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int pow = scn.nextInt();
        int ans = power(n, pow);
        System.out.println("Power (Linear) of "+n+" is : "+ans);
    }

    public static int power(int n, int pow) {
        if (pow == 0) {
            return 1;
        }
        int xpnm1 = power(n, pow - 1);
        int xpn = n * xpnm1;
        return xpn;
    }
}
