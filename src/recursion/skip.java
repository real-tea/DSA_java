package recursion;

public class skip {
    public static void main(String[] args) {
        System.out.println(miss_char("bcaddca"));
        System.out.println(miss_string("no tits"));
    }
    static String miss_char(String up) //java function to miss a character from a string
    {
        if(up.isEmpty()) return "";

        char ch = up.charAt(0);
        if(ch == 'a')
        {
            return miss_char(up.substring(1));
        }else{
            return ch + miss_char(up.substring(1));
        }

    }

    static String miss_string(String up) //java function to miss a part of String from the original String
    {
        if(up.isEmpty())return "";

        if(up.startsWith("tits")){
            return miss_string(up.substring(4));

        }
        else{
            return up.charAt(0) + miss_string(up.substring(1));
        }
    }
}
