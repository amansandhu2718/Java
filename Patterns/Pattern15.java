import java.util.*;

public class Pattern15 {
//   input  5
//                 1
//         2       3       2
// 3       4       5       4       3
//         2       3       2
//                 1
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

      int n=scn.nextInt();
      int sp=n/2;
      int st=1;
      int val=1;
      for(int i=0;i<n;i++){
          for(int j=0;j<sp;j++){
          System.out.print("\t");    
          }
          
          
          
          
          int cval=val;
          for(int j=0;j<st;j++){
                
            System.out.print(cval+"\t");   
           
            if(j<st/2){
                cval++;
            }else{
                cval--;
            }
            
            
          }
          
          
          
          
          
          
          
                if(i<n/2){
                    sp--;
                    st=st+2;
                    val++;
                }else{
                    sp++;
                    st=st-2;
                    val--;
                }
                System.out.println();
                
      }
    }
}