import java.util.Scanner;

public class DisplayDigits {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int temp=n;
        int div=1;
        while(temp>=10){
            
            div=div*10;
            temp=temp/10;

        }
//System.out.println(div);
//  1000/2345= 2 345=  2(quo) & 345(rem)
//by above code we get divisor
while(div>=1){
int quo=n/div;
int rem=n%div;
System.out.println(quo);
div=div/10;    
n=rem;
}





    }
}
