public class PrintSubSequence {
    
    public static void main(String[] args) {
        Printssq("a","");
    }


    public static void Printssq(String str , String res){
        
        if(str.length()==0){
            System.out.println(res);
            return;
        }

        char ch = str.charAt(0); 
        String ros = str.substring(1);

        Printssq(ros, res+"_");
        Printssq(ros, res+""+ch);


    }
}
