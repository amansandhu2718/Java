import java.util.Scanner;

public class PrimeTillN {
 public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
System.out.println("Enter N: ");
int n=scn.nextInt();    //take input from user (N)

    for (int j = 2; j < n; j++) {// loopr for iterating till N
    //    if(j!=0 && j!=1){
        int x=j;
        boolean isprime=true;
     for (int i = 2; i*i <= x; i++) {            // loopr for checking number is prime or not
         
        if(x%i==0){
            isprime=false;                          // toggling variable
        }
     }
     if(isprime==true){
         System.out.println("\t"+x+" is prime");   // printing result
     }
    //    }
    }
 }   
}
