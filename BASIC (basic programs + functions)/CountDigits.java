import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int count=0;
        int n=scn.nextInt();
while(n>0){
    n=n/10;
    count++;
}
System.out.println(count);
    }
}
