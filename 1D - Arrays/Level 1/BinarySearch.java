import java.io.*;
import java.util.*;

public class BinarySearch {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }
    int d = scn.nextInt();
    int idx = -1;
    int low = 0, high = arr.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;

      if (d > arr[mid]) {
        low = mid + 1;
      } else if (d < arr[mid]) {
        high = mid - 1;
      } else {
        idx = mid;
        break;
      }


    }

    System.out.println(idx);
}}