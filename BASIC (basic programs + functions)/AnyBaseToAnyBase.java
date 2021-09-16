import java.util.Scanner;
public class AnyBaseToAnyBase {

  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int result = anytoany(n,sourceBase,destBase);
     System.out.println(result);
   }   
   
   public static int anytodecimal(int n,int base){
       int bp=1;
       int sum=0;
       while(n>0){
           int rem=n%10;
           sum=sum+rem*bp;
           n=n/10;
           bp=bp*base;
       }
       return sum;
       
   }
   public static int decimaltoany(int n,int base){
       
            int tp=1;
       int sum=0;
       while(n>0){
           int rem=n%base;
           sum=sum+rem*tp;
           n=n/base;
           tp=tp*10;
       }
       return sum;
   }
   public static int anytoany(int n,int source,int dest){
       int dec=anytodecimal(n,source);
       int res=decimaltoany(dec,dest);
       return res;
   }
   
  }