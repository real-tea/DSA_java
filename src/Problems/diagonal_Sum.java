package Problems;

public class diagonal_Sum {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        result(arr);
    }
    public static void result(int[][] mat)
    {
        int l = mat.length;
        int n = l-1;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < l; i++)
        {
            sum1 = sum1 + mat[i][i];
            if(n!=i)sum2 = sum2 + mat[n][i];
            n--;
        }
        System.out.println(sum1);
        System.out.println(sum2);

    }
}
