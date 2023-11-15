
public class Factorial {
    public static void main(String[] args) {
        int n=5;
        int res=Recursion(n);
        System.out.println("Factorial is : "+res);
    }
    
    //expectation from Recursion : to print factorial of n
    public static int Recursion(int n){
        if(n==0){ // base case 
            return 1;
        }
        int factOfNMinusOne=Recursion(n-1);//expectation from Recursion: to print factorial of n-1
        int res=n*factOfNMinusOne;
        return res;
    }
}
