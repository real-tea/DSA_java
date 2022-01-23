package HashMaps;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class hash {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();

        map.put("India",145);
        map.put("UK",112);
        map.put("Germany",431);//PUT ->O(1) time

        System.out.println(map.get("UK")); //->returns value for a particular key

        map.remove("Germany");//removes key : value after finding from a key, returns NULL when not found
        //also O(1) time

        map.put("Netherlands",420);
        System.out.println("Set of keys in the given Hash Map : ");
        Set<String> keySet = map.keySet(); //Set used as there is no duplicate keys in a  set
        for(String key : keySet){
            System.out.println(key);
        }

        System.out.println("Values of the Hashmaps");
        Collection<Integer> values = map.values();
        for(Integer val : values){
            System.out.println(val);
        }
    }
}
