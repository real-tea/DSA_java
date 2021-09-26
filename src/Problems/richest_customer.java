package Problems;

public class richest_customer {
    public static void main(String[] args) {
        int acc[][] = { {2,8,7},{7,1,3},{1,9,5}};

        result(acc);
    }

    public static void result(int[][] accounts)
    {
        int row = accounts.length;
        int column = accounts[0].length;
        int max = 0;
        for(int i = 0;i < row; i ++)
        {   int sum = 0;

            for (int j = 0; j < column; j++)
            {
                sum = sum + accounts[i][j];
            }
            if(sum > max) max = sum;
        }
        System.out.println(max);

    }
}
