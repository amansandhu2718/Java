import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
Scanner scn=new Scanner(System.in); 
int n=scn.nextInt();
int base=scn.nextInt();
int tp=1;
int num=0;
while(n>0){
    int rem=n%base;
    n=n/base;
    num=num+rem*tp;
    tp=tp*10;
    
}
System.out.println(num);
    }
}
