package Problems;

public class candy_swap {
    public static void main(String[] args) {
        int[] AliceCandy = {1,2,5};
        int[] BobCandy = {2,4};
        int[] result = fairCandySwap(AliceCandy,BobCandy);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] BobSizes) {
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < aliceSizes.length; i++)
        {
            sumA = sumA + aliceSizes[i];
        }
        for (int i = 0; i < BobSizes.length; i++)
        {
            sumB = sumB + BobSizes[i];
        }
        int diff = (sumA - sumB)/2;
        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < BobSizes.length; j++)
            {
                if(aliceSizes[i] == BobSizes[j] + diff) return new int[]{aliceSizes[i],BobSizes[j]};

            }
            
        }
        return new int[]{0,0};

    }
}
