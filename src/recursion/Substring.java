package recursion;

import java.util.ArrayList;

public class Substring {
    public static void main(String[] args) {
        subs("","abc");

    }
    static void subs(String p, String up)  //Subsequence using normal recursion
    {
        if(up.isEmpty()) {
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);

        subs(p + ch,up.substring(1));
        subs(p,up.substring(1));
    }


    static ArrayList<String> subs2(String p,String up)  //subsequence using Array list
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subs2(p,up.substring(1));
        ArrayList<String> right = subs2(p + ch,up.substring(1));
        left.addAll(right);
        return left;
    }
}
