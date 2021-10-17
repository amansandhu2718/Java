import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = factorial(n);
        System.out.println("factorial of "+n+" is : "+ans);
    }

    public static int factorial(int n) {
        if(n==0){return 1;}
        int nm1fact = factorial(n - 1);
        int nfact = n * nm1fact;
        return nfact;

    }
}
