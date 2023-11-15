

public class DecreasingIncreasing {
    public static void main(String[] args) {
        int n=5;
        Recursion(n);
    }


    public static void Recursion(int n){
        if(n==-1){
            // System.out.println(n);
            return;
        }
        System.out.println(""+n);
        Recursion(n-1);
        System.out.println(""+(n));

    }
}
