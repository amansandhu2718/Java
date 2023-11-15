
import java.util.ArrayList;
import java.util.Scanner;

public class KeypadCodes {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String inputInt= scn.nextLine();
        scn.close();

        ArrayList<String> KPC = GetKPC(inputInt);
        for(int i=0;i<KPC.size();i++){
            System.out.println(KPC.get(i));
        }         

    }

    static String[] keycodes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> GetKPC(String inputString){

        if(inputString.length()==0){
            ArrayList<String> arr=new ArrayList<>();
            arr.add("");
            return  arr;
        }

            char firstChar = inputString.charAt(0);
            String stringAtfirstChar=keycodes[firstChar-'0'];
            // System.out.println(s);


            String ros = inputString.substring(1);
            ArrayList<String> rosKPC=GetKPC(ros);

            ArrayList<String> res=new ArrayList<>();

            
            for(int j=0;j<stringAtfirstChar.length();j++){
                for(int i=0;i<rosKPC.size();i++){
                    res.add(stringAtfirstChar.charAt(j)+rosKPC.get(i));
                }
            }
            return res;

    }
}
