import java.util.Scanner;

public class Power_logarithmic {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();// num
        int n = scn.nextInt();// pow
        int xpn = power(x, n);

        System.out.println("Power (Logarithmic) of " + x + " is : " + xpn);
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xpnb2 = power(x, n / 2);
        int xpn = xpnb2 * xpnb2;
        if (n % 2 == 1) {
            xpn = xpn * x;
        }
        return xpn;
    }
}
