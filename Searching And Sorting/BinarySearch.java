import java.util.Scanner;

// package Searching And Sorting;

public class BinarySearch {
    public static void main(String[] args) {
        
 
        Scanner scn=new Scanner(System.in); //scn -> Reference variable of Scanner type

        System.out.println("enter element to search: "); 
        int elementToSearch=scn.nextInt();  //input element to be searched 

        System.out.println("enter size of array: ");
        int arraySize=scn.nextInt();  // input size of array

        int arr[]=new int[arraySize];
        
        System.out.println("enter elements of array (sorted): ");
        for(int i=0;i<arr.length;i++){  // input arrray from user
            arr[i]=scn.nextInt();
        }


        /** LOGIC */
        int index=-1;
        int low=0;  //pointer pointing to first element of array
        int high=arr.length-1; //pointer pointing to last element of array.

        while(low<=high){   // whhile low is <= high
            int mid=(low+high)/2;   //find mid index 

            if(arr[mid]==elementToSearch){  //if  element at mid index is what we are looking for, then save its index and break the loop.
                index=mid;
                break;
            }else if(elementToSearch>arr[mid]){
                 // if element is greater than element at mid index then move low pointer to mid+1 to discard left side
                low=mid+1;
            }else{
                 // if element is smaller than element at mid index then move high pointer to mid-1 to discard right side
                high=mid-1;
            }
        }

        if(index==-1){
            System.out.println("element not found");
        }else{
            System.out.println("element found at: "+index);
        }

    }
}
