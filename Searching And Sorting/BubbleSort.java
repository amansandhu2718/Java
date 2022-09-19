// package Searching And Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]=new int[]{2,4,3,1,5,45,3,2,70,45};


      for(int j=0;j<arr.length;j++){    //repeat below steps for n times
        for (int i = 0; i < arr.length-1-j; i++) {     
              // arr.length-1-j is to optimize the code (so that we iterate j times less because last elements are already sorted 
            if(arr[i+1]<arr[i]){                         // if elements at i+1  smaller than element at i then, swap both
                //swap
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
      }

        for (int i = 0; i < arr.length; i++) { //utility function to print array
            System.out.println(arr[i]);
        }
    }
}
