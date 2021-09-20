import java.util.*;

public class Pattern05 {
//                   *
//           *       *       *
//   *       *       *       *       *
//           *       *       *
//                   *
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        int sp=n/2;
        int st=1;
        for(int i=0;i<n;i++){
            
          for(int j=0;j<sp;j++){
                System.out.print("\t");
          }
          
          for(int j=0;j<st;j++){
                System.out.print("*\t");
          }
          
          for(int j=0;j<sp;j++){
                System.out.print("\t");
          }
            
            if(i<n/2){
                sp--;
                st=st+2;
                
            }else{
                st-=2;
                sp++;
                
            }
            System.out.println();
        }
    }
}