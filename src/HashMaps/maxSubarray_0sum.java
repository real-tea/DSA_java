package HashMaps;
import java.util.HashMap;

//You have to return the maximum length of sub array that sums up to 0
public class maxSubarray_0sum {
    public static void main(String[] args) {
        int[] arr = {15,-2,2,-8,1,7,10,23};
        int n = 8;
        int x = maxLen(arr,n);
        System.out.println(x);
    }

    public static int maxLen(int[] arr, int n){
        HashMap<Integer , Integer> map = new HashMap<>();
        int max = 0;
        int sum = 0;
        for(int i = 0;i< n; i++){
            sum = sum + arr[i];
            if(sum == 0){
                max = i + 1;
            }
            else{
                if(map.get(sum)!=null){
                    max = Math.max(max,i - map.get(sum));
                }
                else{
                    map.put(sum , i);
                }
            }
        }

        return max;
    }
}
