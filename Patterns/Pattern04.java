import java.util.*;

public class Pattern04 {
    // *       *       *       *       *
    //         *       *       *       *
    //                 *       *       *
    //                         *       *
    //                                 *
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        int st=n;
        int sp=0;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<sp;j++){
                System.out.print("\t");
            }
            
            for(int j=0;j<st;j++){
                 System.out.print("*\t");
            }
             System.out.println();
             sp++;
             st--;
        }

    }
}