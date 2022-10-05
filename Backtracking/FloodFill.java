public class FloodFill{

    /**
     * You are given a 2d array of dimensions n*m.
         This array is filled with either 0 or 1. You can only move to cells which have 0 value in them. You can't move out of the boundaries or in the cells which have value 1 in them (1 means obstacle)
    `    Only four moves are allowed: 't' (1-step up), 'l' (1-step left), 'd' (1-step down) 'r' (1-step right) in the given order only.
         You are required to print all paths that can be used to move from top-left to bottom-right.
     */
    public static void main(String[] args) {
        int row=3;
        int col=3;
        int arr[][]=new int[][]{{1,0,1},{0,1,0},{0,0,0}};
        boolean visited[][]=new boolean[row][col];
        PrintPaths(arr,0,0,2,2,"",visited);
    }

    public static void PrintPaths(int [][]arr,int sr, int sc, int dr, int dc,String asf , boolean[][] visited){
    if( sr<0|| sc<0 || sr==arr.length || sc==arr[0].length ||arr[sr][sc]==1 ||visited[sr][sc]==true){
        return;
    }
    if(sr==dr && sc==dc){
        System.out.println(asf);
      
        return;
    }
    visited[sr][sc]=true;
    PrintPaths(arr, sr-1,  sc,   dr,  dc, asf+"T",visited);
    PrintPaths(arr, sr,  sc-1,   dr,  dc, asf+"L",visited);
    PrintPaths(arr, sr+1,  sc, dr,  dc, asf+"D",visited);
    PrintPaths(arr, sr,  sc+1,   dr,  dc, asf+"R",visited);
    visited[sr][sc]=false;

    }
}