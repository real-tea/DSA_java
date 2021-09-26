package Problems;

import java.util.*;

public class Lucky_number_matrix {
    public static void main(String[] args) {
        int[][] arr = {{3,7,8},{9,11,13},{15,16,17}};
        result(arr);
    }

    public static void result(int[][] matrix) {
        List<Integer> ans = new ArrayList();

        for (int i = 0; i < matrix.length; i++) {
            int min = minRow(i,matrix);
            int pos = minPos(min,i,matrix);
            if(min == maxCol(pos,matrix)) ans.add(min);
        }
        System.out.println(ans);
    }

    public static int maxCol(int pos ,int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            if(matrix[i][pos] > max) max = matrix[i][pos];
            
        }
    return max;
    }

    public static int minRow(int n,int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix[0].length; i++)
        {
            if(matrix[n][i] < min)min = matrix[n][i];

        }
        return min;

    }

    public static int minPos(int min,int n,int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            if(matrix[n][i] == min)return i;
        }
        return -1;

    }
}
