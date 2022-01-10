package Problems;

public class Leetcode_275_1 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{1,2,3},{1,2,3}};
        System.out.println(checkValid(matrix));

    }
    public static boolean checkValid(int[][] matrix){
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] > n) return false;
            }
        }
        return true;

    }
}
