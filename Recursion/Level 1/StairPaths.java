
import java.util.ArrayList;

public class StairPaths {  //question: you are at nth stair and have to move to ground jumps (of steps) allowed on stairs 1,2,3
    // eg:  3 steps total and you are on third 0 is ground possible outcome  [1,1,1]  [2,1] [1,2] [3]
    public static void main(String[] args) {
        int stairs=4;
        ArrayList<String> arrlist=Recursion(stairs);
        for(int i=0;i<arrlist.size();i++){
            System.out.println(arrlist.get(i));
        }
    }

    public static ArrayList<String> Recursion(int n){
    
        if(n==0){
            ArrayList<String> ress=new ArrayList<>();
            ress.add("");
            return ress;
        }else if(n<0){
            ArrayList<String> ress=new ArrayList<>();
            return ress;
        }


        ArrayList<String> arrresNM1= Recursion(n-1);
        ArrayList<String> arrresNM2= Recursion(n-2);
        ArrayList<String> arrresNM3= Recursion(n-3);
        ArrayList<String> arrres=new ArrayList<>();

        for(int i=0;i<arrresNM1.size();i++){
            arrres.add("1"+arrresNM1.get(i));
        }

        for(int i=0;i<arrresNM2.size();i++){
            arrres.add("2"+arrresNM2.get(i));
        }

        for(int i=0;i<arrresNM3.size();i++){
            arrres.add("3"+arrresNM3.get(i));
        }
        return arrres;
    }
}
