package Problems;

public class jump_game {
    public static void main(String[] args) {
        int[] array = {3,2,1,0,4};
        boolean ans = result(array);
        System.out.println(ans);}

    public static boolean result(int[] nums) {
        int maxReach = 0;
        int i = 0;
        while(i < nums.length && i <= maxReach)
        {
            if(i + nums[i] > maxReach) maxReach = i + nums[i];
            i++;
        }

        if(i == nums.length)return true;

        return false;
    }
}
