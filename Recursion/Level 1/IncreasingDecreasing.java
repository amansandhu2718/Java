
public class IncreasingDecreasing {
 public static void main(String[] args) {
    int n=5;
    int i=0;
    Recursion(i, n);
 }  
 public static void Recursion(int i,int n){
    
    if(i==n+1){
        // System.out.println(n);
        return;
    }
    System.out.println(""+i);
    Recursion(i+1,n);
    System.out.println(""+i);
} 
}
