package Problems;

public class product_of_Array_exceptself
{
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        result(a);

    }

    public static void result(int[] nums)
    {
        int[] res = new int[nums.length];
        int temp = 1;

        for (int i = 0; i < nums.length; i++)
        {
            res[i] = temp;
            temp *= nums[i];
        }
        temp = 1;
        for (int i = nums.length - 1; i >= 0 ; i--)
        {
            res[i] *= temp;
            temp *= nums[i];
            
        }
        for (int i = 0; i < nums.length; i++)
        {
            System.out.println(res[i]);

        }

    }
}
