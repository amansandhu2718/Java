import java.util.ArrayList;
import java.util.Scanner;

public class MazePath {
 public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    ArrayList< String> paths = getMazePaths(1, 1, n, m);
    System.out.println(paths);   
    
 }  
 
 public static ArrayList<String> getMazePaths(int curRow, int curCol , int desRow, int desCol){

if(curRow==desRow && curCol==desCol){
        ArrayList<String> res= new ArrayList<>();
        res.add("");
        return res;    
}

    ArrayList<String> res= new ArrayList<>();

    // horizontal move
    if(curCol<desCol){
        ArrayList<String> ResHor = getMazePaths( curRow, curCol+1 , desRow, desCol );
        for(int i=0;i< ResHor.size();i++){
            res.add("H"+ResHor.get(i));
        }
    }

    if(curRow<desRow){
        ArrayList<String> ResVer = getMazePaths( curRow+1, curCol , desRow, desCol );
        for(int i=0;i< ResVer.size();i++){
            res.add("V"+ResVer.get(i));
        }
    }

    return res;
 }

}
