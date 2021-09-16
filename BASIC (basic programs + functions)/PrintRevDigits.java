import java.util.Scanner;

public class PrintRevDigits {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        while(n>0){
            int rem=n%10;
            System.out.println(rem);
            n=n/10;
        }

    }
}
