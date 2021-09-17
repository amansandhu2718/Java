import java.util.*;

public class PrimeTillN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

int low=scn.nextInt();
int high=scn.nextInt();

for(int k=low;k<=high;k++){
    int n=k;
boolean isprime=true;
for(int i=2;i*i<=n;i++){
    if(n%i==0){
        isprime=false;
    }
}
    if(isprime==false){
        
    }
    else{
         System.out.println(n);
    }

}

}}