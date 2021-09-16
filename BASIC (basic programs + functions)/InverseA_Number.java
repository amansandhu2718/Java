import java.util.Scanner;
import java.lang.Math;
public class InverseA_Number {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        //numbber=  12534
        //pos=      54321
        //inverse=  31245
        //pos=      54321
// if 4 is at 1st pos then in inverse, 1 will be at 4th pos
int pos=1;
int num=0;
while(n!=0){
int rem=n%10;
 rem=rem-1;
int x= (int)Math.pow(10, rem);
 x=pos*x;
num=num+x;
n=n/10;
pos++;
}
System.out.println(num);




    }
}
