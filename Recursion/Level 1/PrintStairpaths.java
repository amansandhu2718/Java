public class PrintStairpaths {
    public static void main(String[] args) {
        PrintStairPaths(4, "");
    }

    public static void PrintStairPaths(int stair ,String res){

        if(stair<0){
            return;
        }
        if(stair==0){
            System.out.println(res);
            return;
        }

        PrintStairPaths(stair-1, res + " 1 ");
        PrintStairPaths(stair-2, res + " 2 ");
        PrintStairPaths(stair-3, res + " 3 ");

    }
}
