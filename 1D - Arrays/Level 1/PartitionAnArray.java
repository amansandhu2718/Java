public class PartitionAnArray {
    public static void main(String[] args) {
            
        int arr[]=new int []{2,1,7,4,6,5,3};
// int s=Partition(arr);
        // System.out.println("s:"+s);
        quickSort(arr, 0,arr.length-1);
    
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
            int pi = Partition(arr);
            System.out.println("pi"+pi);
            quickSort(arr, low, pi-1 );
            quickSort(arr, pi , high);
        }
    }
    public static int Partition(int arr[]){
        int pivotElement=arr[arr.length-1];
            int i=0;
            int j=-1;
            while(i<arr.length){
              if(arr[i]<pivotElement){
                j++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
              }else{
                i++;
              }
            }
           
        return j-1;
    }
    static int partition(int[] arr, int low, int high)
    {
 
        // pivot
        int pivot = arr[high];
 
        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);
 
        for (int j = low; j <= high - 1; j++) {
 
            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot) {
 
                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
 
}

