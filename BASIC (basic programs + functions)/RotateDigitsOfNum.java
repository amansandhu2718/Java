import java.util.*;
   
   public class RotateDigitsOfNum{
   
   public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
     int n=scn.nextInt();
     int k=scn.nextInt();
       
   
     int temp=n;
     int count=0;
     while(temp>0){
         count++;
         temp=temp/10;
     }
     k=k%count;
     if(k<0){
         k=k+count;
     }
       int div=1;
     int mul=1;
     for(int i=1;i<=count;i++){
         if(i<=k){
             div=div*10;
         }else{
             mul=mul*10;
         }
     }
  int r=n%div;
  int q=n/div;
  r=r*mul;
  int ans=r+q;
  System.out.println(ans);
     
     
     
    }
   } 