// package Searching And Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        
        int arr[]=new int[]{2,4,3,1,5,45,3,2,70,45};
        
    // ------------------------------------------------
                        //LOGIC 
    // ------------------------------------------------
            // for eveery element find smallest from its right and swap both elements.
    // ------------------------------------------------


        for(int i=0;i<arr.length-1;i++){    
            int smallest=arr[i];                
            int index=-1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<smallest){
                    smallest=arr[j];
                    index=j;
                }   
            }
            if(index!=-1){
                //swap
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
