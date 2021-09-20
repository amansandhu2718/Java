import java.util.*;
public class Pattern13{
// input    5
// 1
// 1       0
// 1       1       0
// 1       2       2       1
// 1       3       4       4       3
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
int n=scn.nextInt();
     for(int i=0;i<n;i++){
         int icj=1;
         for(int j=0;j<=i;j++){
             int icjp1=icj*(i-1)/(j+1);
             System.out.print(icj+"\t");
             icj=icjp1;
         }
         System.out.println();
     }

    }
}