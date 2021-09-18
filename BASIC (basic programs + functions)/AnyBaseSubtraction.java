import java.util.*;

public class AnyBaseSubtraction {
//note: N2 is greater than N1
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getDifference(b, n1, n2);
    System.out.println(d);
  }

  public static int getDifference(int b, int n1, int n2) {
    int sub = 0, c = 0,mul=1;
    while (n2 > 0 ) {
      int d = 0;

      int rem1 = n1 % 10;
      int rem2 = n2 % 10;
      d = (rem2 - c) - rem1;

      if (d < 0) {
        d = d + b;
        c = 1;
      } else {
        c = 0;
      }
        sub=sub+d*mul;
n1=n1/10;
n2=n2/10;
mul=mul*10;
    }
    
    return sub;
    
    
  }

}