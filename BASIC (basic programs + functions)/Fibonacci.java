import java.util.Scanner;
public class Fibonacci {
 public static void main(String[] args) {
    Scanner scn=new Scanner(System.in); 
    System.out.println("Enter N: ");
    int n=scn.nextInt();
    int a=0;
     int b=1;
     for(int i=1;i<=n;i++){
        int c=a+b;
        System.out.println("\t"+a);
        a=b;
        b=c;
     }
 }   
}
