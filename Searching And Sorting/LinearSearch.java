import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in); //scn -> Reference variable of Scanner type

        System.out.println("enter element to search: "); 
        int elementToSearch=scn.nextInt();  //input element to be searched 

        System.out.println("enter size of array: ");
        int arraySize=scn.nextInt();  // input size of array

        int arr[]=new int[arraySize];
        
        System.out.println("enter elements of array: ");
        for(int i=0;i<arr.length;i++){  // input arrray from user
            arr[i]=scn.nextInt();
        }

      
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==elementToSearch){
               index=i;
                break;
            }
        }

        if(index!=-1){
            System.out.println("element found at :"+index);
        }else{
            System.out.println("element not found.");
        }

    }
}