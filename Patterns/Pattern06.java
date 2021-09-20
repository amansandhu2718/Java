import java.util.*;

public class Pattern06 {
    // 5
    // *       *       *               *       *       *
    // *       *                               *       *
    // *                                               *
    // *       *                               *       *
    // *       *       *               *       *       *
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        int st=(n/2)+1;
        int sp=1;
        for(int i=0;i<n;i++){
           for(int j=0;j<st;j++){
                System.out.print("*\t");
           }
           
           for(int j=0;j<sp;j++){
                System.out.print("\t");
           }
           
           for(int j=0;j<st;j++){
                System.out.print("*\t");
           }
            if(i<n/2){
            st--;
            sp=sp+2;
            }else{
                st++;
                sp=sp-2;
            }
             System.out.println();
        }

    }
}