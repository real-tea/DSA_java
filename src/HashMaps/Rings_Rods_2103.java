package HashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Rings_Rods_2103 {
    public static void main(String[] args) {
        String s = "B1G5G3B9B7B9G5G5B4R4";
        int res = countPoints(s);
        System.out.println(res);
    }
    public static int countPoints(String rings){

        HashMap<Integer , String> result = new HashMap<>();

        int res = 0;

        for(int i = 0; i < rings.length(); i = i + 2){
            char c = rings.charAt(i);
            int ring = Character.getNumericValue(rings.charAt(i+1));
            result.put(ring , result.getOrDefault(ring , " ")+c);

        }

        for(Map.Entry<Integer,String> entry:result.entrySet()) {
            if (entry.getValue().contains("B") && entry.getValue().contains("G") && entry.getValue().contains("R"))
                res++;
        }

        return res;
    }
}
