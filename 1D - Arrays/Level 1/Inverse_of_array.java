
import java.util.*;

public class Inverse_of_array{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

  public static int[] inverse(int[] a){
  int b[]=new int[ a.length];
   for (int i=0;i<a.length ;i++ ){
       int x=a[i];
       b[x]=i;
   } 
    return b;
  }

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);

    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = scn.nextInt();
    }

    int[] inv = inverse(a);
    display(inv);
 }

}