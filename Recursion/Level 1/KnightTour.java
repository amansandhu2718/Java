public class KnightTour {
 public static void main(String[] args) {
    
    int n=5;
    int board[][]=new int[n][n];
    Tour(board,0,0,1,true);
    
 }  
 

 public static void Tour(int arr[][], int row,int col , int step, boolean printAllSolutions){

    if(row<0 || col<0 || row>=arr[0].length || col>=arr.length || arr[row][col] != 0){
        return;
    }

    if(step==arr.length * arr[0].length){  // when visit last step
            arr[row][col]=step;
            for(int i=0;i<arr[0].length;i++){
                for(int j=0;j< arr.length;j++){
                    System.out.print(arr[i][j]+"\t");
                }
                System.out.println();
            }
            if(printAllSolutions==true){
                arr[row][col]=0;
            }
            System.out.println("-----------------------------------");
            return;
    }

    int nextRow;
    int nextCol;

    arr[row][col]=step; // placing current step in current index
    int nextStep=step+1;

    // when knight moves top left 
    nextCol=col-1;
    nextRow=row-2;
    Tour(arr,nextRow,nextCol,nextStep,printAllSolutions);
    //  when knight moves top right
    nextCol=col+1;
    nextRow=row-2;
    Tour(arr,nextRow,nextCol,nextStep,printAllSolutions);

    // when knight moves left left
    nextCol=col-2;
    nextRow=row+1;
    Tour(arr,nextRow,nextCol,nextStep,printAllSolutions);

    //  when knight moves left right
    nextCol=col-2;
    nextRow=row-1;
    Tour(arr,nextRow,nextCol,nextStep,printAllSolutions);

    //  when knight moves rightleft 
    nextCol=col+2;
    nextRow=row-1;
    Tour(arr,nextRow,nextCol,nextStep,printAllSolutions);

    //  when knight moves right right
    nextCol=col+2;
    nextRow=row+1;
    Tour(arr,nextRow,nextCol,nextStep,printAllSolutions);

    //  when knight moves bottom left
    nextCol=col-1;
    nextRow=row+2;
    Tour(arr,nextRow,nextCol,nextStep,printAllSolutions);

    // when knight moves  bottom right
    nextCol=col+1;
    nextRow=row+2;
    Tour(arr,nextRow,nextCol,nextStep,printAllSolutions);
    
    
    arr[row][col]=0;

 }


}
