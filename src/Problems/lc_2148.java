package Problems;
import java.util.Arrays;


public class lc_2148 {
    public static void main(String[] args) {
        int[] nums = { 11 , 11, 2, 15};
        System.out.println(countElements(nums));
    }

    public static int countElements(int[] nums) {
        Arrays.sort(nums);
        int result = nums.length - 1;
        for(int i = 1; i < nums.length -2; i++)
        {
            if(nums[i]!=nums[0] && nums[i]!=nums[nums.length-1])
            {
                result--;
            }

        }
        return result;
    }
}
