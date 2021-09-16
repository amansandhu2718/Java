import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in); 
int n=scn.nextInt();
int base=scn.nextInt();
int tp=1;
int num=0;
while(n>0){
    int rem=n%10;
    n=n/10;
    num=num+rem*tp;
    tp=tp*base;
    
}
System.out.println(num);
    }
}
