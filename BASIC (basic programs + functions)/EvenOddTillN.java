import java.util.Scanner;

public class EvenOddTillN {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter N:");
        int n=scn.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i%2==0){
                System.out.println(i+" is Even");
            }else{
                System.out.println(i +" is odd");
            }
        }
    }
}
