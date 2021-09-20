import java.util.*;

public class Pattern10{
    // input 5,7,9 (odd)
    //                 *
    //         *               *
    // *                               *
    //         *               *
    //                 *
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
int os=n/2;
int isp=-1;
for(int i=0;i<n;i++){
    for(int j=0;j<os;j++){
        System.out.print("\t");
    }
    System.out.print("*\t");
    for(int j=0;j<isp;j++){
        System.out.print("\t");
    }
    
    if(i>0 && i<n-1){
        System.out.print("*\t");
    }
    
   
    
    if(i<n/2){
        os--;
        isp=isp+2;
    }else{
        os++;
        isp=isp-2;
    }
    
     System.out.println();
}

 }
}