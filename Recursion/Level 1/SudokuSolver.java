public class SudokuSolver{
    public static void main(String[] args) {
        
        int Ques [][] = new int [][]{

            {1, 0, 0, 8, 0, 0, 0, 0, 9},
            {0, 0, 0, 3, 0, 5, 0, 8, 7},
            {3, 9, 0, 0, 0, 0, 6, 0, 0},
            {0, 0, 0, 0, 5, 7, 9, 0, 0},
            {5, 0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 4, 6, 0, 0, 0, 0},
            {0, 0, 4, 0, 0, 0, 0, 1, 5},
            {2, 8, 0, 5, 0, 1, 0, 0, 0},
            {9, 0, 0, 0, 0, 4, 0, 0, 3}
           
        };

       SolveSudoku(Ques,0,0);

        

    }

    public static boolean isSafe(int board[][],int row,int col,int val){
        
        boolean res=true;
        
        if(res==true){ // check col
            for(int i=0;i<board[0].length;i++){
                if(board[row][i]==val){
                    res=false;
                }
            }
        }
        
        if(res==true){ // check row
            for(int i=0;i<board.length;i++){
                if(board[i][col]==val){
                    res=false;
                }
            }
        }

        if(res==true){ // check sub matrix

            // logic: 
            // find first element of submatrix from given pos

            // example:
                    /*  marked with * are start point of submatrix

                            0  1  2        3  4  5      6  7  8

                     0    * 1, 0, 0,     * 8, 0, 0,   * 0, 0, 9
                     1      0, 0, 0,       3, 0, 5,     0, 8, 7
                     2      3, 9, 0,       0, 0, 0,     6, 0, 0

                     3    * 0, 0, 0,     * 0, 5, 7,   * 9, 0, 0
                     4      5, 0, 0,       0, 0, 0,     0, 0, 1
                     5      0, 0, 0,       4, 6, 0,     0, 0, 0

                     6    * 0, 0, 4,     * 0, 0, 0,   * 0, 1, 5
                     7      2, 8, 0,       5, 0, 1,     0, 0, 0
                     8      9, 0, 0,       0, 0, 4,     0, 0, 3
            
                     if we want to find submatrix first element of pos (4,5)
                     ROW: 4/3*3 = 1*3 = 3
                     COL:  5/3*3 = 1*3 = 3
                     ans = 3,3

                     if we want to find submatrix first element of pos (8,8)
                     ROW: 8/3*3 = 2*3 = 6
                     COL: 8/3*3 = 2*3 = 6
                     ans = 6,6

                     if we want to find submatrix first element of pos (0,1)
                     ROW: 0/3*3 = 0*3 = 0
                     COL: 1/3*3 = 0*3 = 0
                     ans = 0,0

                    */



            // now iterate submatrix and check if element exist.
            int subMatInitRow= row/3*3;
            int subMatInitCol= col/3*3;
            for(int i=subMatInitRow+0;i<subMatInitRow+3;i++){
                for(int j=subMatInitCol+0;j<subMatInitCol+3;j++){
                    if(board[i][j]==val){
                        res=false;
                        break;
                    }
                }
            }

        }

        return res;
    }


    public static void SolveSudoku(int board[][], int row , int col){
      
        if(row==board.length){
            // System.out.println(board[row][col]);
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }

            System.out.println("-----------------");
            return;
        }        

        // board iteration logic starts here
        int nextRow=0;
        int nextCol=0;
        if(col==board[0].length-1){
            // System.out.println(board[row][col]);
            nextCol=0;
            nextRow=row+1;
        }else{
            // System.out.print(board[row][col]);
            nextCol=col+1;
            nextRow=row;
        }
        // board iteration logic ends here


        // if at current pos is already filled go to next pos
        if(board[row][col]>0){
            SolveSudoku(board,nextRow,nextCol);
        }else{
            // if at current pos is empty , write logic here
            for(int val=1;val<10;val++){

                if(isSafe(board,row,col,val)==true){
                    board[row][col]=val;
                    SolveSudoku(board,nextRow,nextCol);
                    board[row][col]=0;
                }

            }

        }


      

    }

    
}





// public class SudokuSolver{
//     public static void main(String[] args) {
        
//         int Ques [][] = new int [][]{

//             {1, 0, 0, 8, 0, 0, 0, 0, 9},
//             {0, 0, 0, 3, 0, 5, 0, 8, 7},
//             {3, 9, 0, 0, 0, 0, 6, 0, 0},
//             {0, 0, 0, 0, 5, 7, 9, 0, 0},
//             {5, 0, 0, 0, 0, 0, 0, 0, 1},
//             {0, 0, 0, 4, 6, 0, 0, 0, 0},
//             {0, 0, 4, 0, 0, 0, 0, 1, 5},
//             {2, 8, 0, 5, 0, 1, 0, 0, 0},
//             {9, 0, 0, 0, 0, 4, 0, 0, 3}
            
//         };

//        SolveSudoku(Ques,0,0);

        

//     }


//     public static void SolveSudoku(int board[][], int row , int col){
//         if(row==board.length-1 && col==board[0].length-1){
//             System.out.println(board[row][col]);
//             return;
//         }        
//         int nextRow=0;
//         int nextCol=0;
//         if(col==board[0].length-1){
//             System.out.println(board[row][col]);
//             nextCol=0;
//             nextRow=row+1;
//         }else{
//             System.out.print(board[row][col]);
//             nextCol=col+1;
//             nextRow=row;
//         }
//         SolveSudoku(board,nextRow,nextCol);

//     }

    
// }