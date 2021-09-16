import java.util.Scanner;

public class ReverseA_Number {
    public static void main(String[] args) {
        System.out.println("Enter number to be reversed: ");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int temp=n;
        int div=1;
        while(temp>=10){
            div=div*10;
            temp=temp/10;
        }

        System.out.println(div);
int newnum=0;
        while(n>0){
    int rem=n%10;
newnum=rem*div+newnum;
div=div/10;
n=n/10;
}
System.out.println(newnum);


    }
}
