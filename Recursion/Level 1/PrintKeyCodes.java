public class PrintKeyCodes {
    public static void main(String[] args) {
        
        PrintKPC("12","");
    }


    static String[] keycodes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void PrintKPC(String code, String res){
        if(code.length()==0){
            System.out.println(res);
            return;
        }

        char ch = code.charAt(0);
        String ros = code.substring(1);

        int index=ch-'0';
        String str=keycodes[index];

        for(int i=0;i<str.length();i++){
          PrintKPC(ros, res+str.charAt(i));
        }

    }
}
