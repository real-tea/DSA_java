package recursion;
import java.util.*;

public class letter_Comb {
    public static void main(String[] args) {
        NumPad("","12");

    }
    static void NumPad(String p , String up){
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1)*3; i < digit*3; i++) {
            char ch = (char)('a' + i);
            NumPad(p + ch,up.substring(1));
        }
    }

    static ArrayList<String> NumPadret(String p , String up){
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();


        for (int i = (digit - 1)*3; i < digit*3; i++) {
            char ch = (char)('a' + i);
            list.addAll(NumPadret(p + ch,up.substring(1)));
        }
        return list;
    }
}
