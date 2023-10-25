package chauhan.DSA.backtracking;

public class keypadCombinations {

    public static void main(String[] args) {
        keypadCombo("","79");
    }

    public static void keypadCombo(String p,String up){
        if(up.isEmpty()){
            System.out.print("\""+p+"\"  ");
            return;
        }

        int digit = up.charAt(0) - '0';
        int start = (digit-2)*3;
        int end = start + 3;

        if(digit==8 || digit==9){
            start++;
        }

        if(digit==7 || digit==9){
            end = start+4;
        }

        for(int i=start;i<end;i++){
            char ch = (char)(i+97);
            keypadCombo(p+ch,up.substring(1));
        }
    }
}
