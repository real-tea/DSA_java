package Problems;

public class first_last
{
    public static void main(String[] args) {
        int[] num = {5,7,7,8,8,10};
        int target = 8;

        int[] result = searchRange(num,target);

        for (int i = 0; i < 2; i++)
        {
            System.out.println(result[i]);
        }

    }
    public static int[] searchRange(int[] nums, int target)
    {
        int n = nums.length;
        int first = -1, last = -1;
        for (int i = 0; i < n; i++) {
            if (target != nums[i])
                continue;
            if (first == -1)
                first = i;
            last = i;
        }
        return new int[]{first,last};
    }


}
