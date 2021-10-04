import java.io.*;
import java.util.*;

public class Subset_of_array{

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int [] arr=new int[n];
    for (int i=0;i<n ;i++ ){
        arr[i]=scn.nextInt();
    } 
    
    
    
    int pow=(int)Math.pow(2,n);
    
    for(int i=0;i<pow;i++){
        int temp=i;
        String a="";
        for(int j=n-1;j>=0;j--){
            int rem=temp%2;
            temp=temp/2;
            if(rem==0){
            a="-\t"+a;
            }else{
                a=arr[j]+"\t"+a;
            }
        }System.out.println(a);
    }
 }

}