
public class NQueeens {
    public static void main(String[] args) {
            System.out.println("---------------------------------------------");
            int count[]=new int[]{0};
            int queens=2;
            int arr[][]=new int[queens][queens];
            Queens(arr,0,count);
            System.out.println("Total outputs: "+count[0]);
            
    }
    

    public static void displayArr2d(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print("\t"+arr[i][j]);
            }
            // System.out.println();
            System.out.println();
            System.out.println();
        }  
    }
   
    
    public static boolean isSafe(int arr[][],int row,int col){

        boolean res=true;

        // vertical check
        int rowV=row;
        for(int i=0;i<rowV;i++){
            if (arr[i][col] == 1) {
                res = false;
            }
        }

        // left horizontal check
        int rowv2=row;
        int colv2=col;
        while(rowv2>=0 && colv2>=0){
             if(arr[rowv2][colv2]==1){
                res=false;
            }
            colv2--;
            rowv2--;
        }
        // // right horizontal check
        rowv2=row;
        colv2=col;

       while(rowv2>=0 && colv2<arr[0].length){
             if(arr[rowv2][colv2]==1){
                res=false;
            }
            colv2++;
            rowv2--;
        }

        return res;

    }

    public static void Queens(int arr[][] ,int row,int count[]){

        if(row==arr.length){
            // create matrix and return;
            count[0]++;
            displayArr2d(arr);
            System.out.println("-------------------------------------------------");
            return;
        }


       for(int i=0;i<arr[0].length;i++){
            if(isSafe(arr, row,i)){
                arr[row][i]=1;
                Queens(arr, row+1,count);
                arr[row][i]=0;
            }
       }


    }
}
