package HashMaps;

import java.util.HashMap;

public class Max_characters {
    public static void main(String[] args) {
        String s = "aabbabbacc";
        Output(s);

    }
    public static void Output(String s)
    {
        HashMap<Character,Integer> result = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(result.containsKey(c)){
                int ov = result.get(c);
                int nv = ov + 1;
                result.put(c , nv);
            }else{
                result.put(c , 1 );
            }

        }
        System.out.println(result);

    }
}
