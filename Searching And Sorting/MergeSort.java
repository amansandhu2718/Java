// package Searching And Sorting;

public class MergeSort {
    public static void main(String[] args) {
        
        int arr[]=new int[]{2,4,3,1,5,45,3,2,70,45};
       int arrRes[]= mergeSort(arr,0,arr.length-1);

        for (int i = 0; i < arrRes.length; i++) {
            System.out.println(arrRes[i]);
        }
    }

    public static int [] mergeSort(int arr[],int low,int high){
        if(low>=high){   //base case
            int res[]=new int[1];  //create new aray of 1 size
            res[0]=arr[low];// copy element from arr to newly created arr
            return res;  //return newly created array
        }
        int mid=(low+high)/2;       //find mid point to divide the array into two equal halves
       int sortedOne[]= mergeSort(arr, low, mid);   // recursive call for 1st half
       int sortedTwo[] =mergeSort(arr,  mid+1,high); // recursive call for second half
       int result[]= MergeTwoSortedArray(sortedOne,sortedTwo); //join two sorted returned arrays
       return result; // return result
    }

    public static int[] MergeTwoSortedArray(int arr1[],int arr2[]){
        int arr3[]=new int[arr1.length+arr2.length];
        int low=0;
        int high=0;
        int i=0;
        while(low<arr1.length && high<arr2.length){
            if( arr1[low]<=arr2[high] ){
                arr3[i]=arr1[low];
                low++;
            }else {
                arr3[i]=arr2[high];
                high++;
            }
            i++;
        }
        while(low<arr1.length){
            arr3[i]=arr1[low];
            low++;
            i++;
        }
        while(high<arr2.length){
            arr3[i]=arr2[high];
            i++;
            high++;
        }
        return arr3;
    }


}
