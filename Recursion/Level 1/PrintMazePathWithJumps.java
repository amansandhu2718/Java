public class PrintMazePathWithJumps {
    public static void main(String[] args) {
        
        PrintMP(1,1, 3,3,"");
    }

    public static void PrintMP(int sr , int sc , int dr , int dc , String res){

        if(sr==dr && sc==dc){
            System.err.println(res);
            return;
        }

        if(sc < dc){
            PrintMP(sr, sc+1, dr, dc, res+"H");
        }

        if(sr < dr && sc < dc){
            PrintMP(sr+1, sc+1, dr, dc, res+"D");
        }


        if(sr < dr){
            PrintMP(sr+1, sc, dr, dc, res+"V");
        }

    }
}
