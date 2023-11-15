
public class TowerOfHanoi {
    public static void main(String[] args) {
        //expectation: prints steps to move n discs from Tower A to Tower B using Tower c; 
        towerOfHanoi(3,"A","B","C");
    }

    public static void towerOfHanoi(int num , String tower1 , String tower2 ,String tower3 ){

            if(num==1){
                System.out.println(num+" from: "+tower1+" to "+ tower2);
                return;
            }

        towerOfHanoi(num-1, tower1, tower3, tower2);
        System.out.println(num+" from: "+tower1+" to "+ tower2);
        towerOfHanoi(num-1, tower3, tower2, tower1); 
        
    }
}
