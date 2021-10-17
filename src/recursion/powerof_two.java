package recursion;

public class powerof_two {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(potwo(n));
    }

    public static boolean potwo(int n) {
        if(n == 1)return true;
        if(n%2 != 0 || n == 0) return false;
        return potwo(n/2);
    }
}
