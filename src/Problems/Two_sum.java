package Problems;
import java.util.Scanner;

public class Two_sum {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] m;
        int size;
        System.out.println("Enter size of array");
        size = sc.nextInt();
        m = new int[size];
        System.out.println("enter array");
        for (int i = 0; i < size; i++) {
            m[i] = sc.nextInt();
        }
        System.out.println("enter target element");
        int target = sc.nextInt();
        int result = twoSum(m,target);
        if(result == 0) System.out.println("Indices not found");


    }
    public static int twoSum(int[] nums, int target)
    {   int target2;
        for(int i = 0;i < nums.length;i++)
        {
            target2 = target - nums[i];
            for(int j = 0;j < nums.length;j++)
            {
                if(i==j) continue;
                if(target2 == nums[j]){
                    System.out.println("target indices are : "+i+" "+j);
                    return 1;


                }
            }
        }

        return 0;

    }

}
