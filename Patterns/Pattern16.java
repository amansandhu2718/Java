import java.util.*;

public class Pattern16{
    // input 5
    // 1                                                               1
    // 1       2                                               2       1      
    // 1       2       3                               3       2       1      
    // 1       2       3       4               4       3       2       1      
    // 1       2       3       4       5       4       3       2       1  
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n=scn.nextInt();
    int st=1;
    int sp=2*n-3;
                    for(int i=0;i<n;i++){
                        int a=1;
                        for(int j=0;j<st;j++){
                            System.out.print(a+"\t");
                            a++;
                        }
                        for(int j=0;j<sp;j++){
                            System.out.print("\t");
                        }
                        if(i==n-1){
                            st--;
                        a=a-2;
                            
                        }else{
                            a--;
                        }
                        
                        for(int j=0;j<st;j++){ 
                            System.out.print(a+"\t");
                       a--;
                            
                        }
                        
                        
                        
                        st++;
                        sp=sp-2;
                        System.out.println();
                        
                    }

 }
}