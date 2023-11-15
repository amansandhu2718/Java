
import java.util.ArrayList;
import java.util.Scanner;

public class SubSequence {
    

    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);
        String inputString= scn.nextLine();
        scn.close();

        ArrayList<String> SSQ=GetSSQ(inputString);

        for(int i=0;i<SSQ.size();i++){
            System.out.println(SSQ.get(i));
        }

    }


    public static ArrayList<String> GetSSQ(String str){
        if(str.length()==0){
            ArrayList<String> ssq=new ArrayList<>();
            ssq.add("");
            return ssq;
        }
        
            ArrayList<String> ssq=new ArrayList<>();
      
            char ch=str.charAt(0);                          // get first char
            String ros=str.substring(1);   // get rest of string
            ArrayList<String> rosSSQ=GetSSQ(ros);
            
            for(int i=0;i<rosSSQ.size();i++){
                ssq.add("_"+rosSSQ.get(i));
                ssq.add(ch+rosSSQ.get(i));
            }

        return ssq;
    }
}
