package recursion;

public class numStepsToZero_rec {


    public static void main(String[] args) {
        int n = 8;
        System.out.println(Solution(n,0));
    }

    public static int Solution(int num,int count) {
        if(num == 0) return count;
        if(num%2 == 0) num = num/2;
        else num--;
        count++;
        return Solution(num,count);
    }



}
