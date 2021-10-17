package recursion;

public class hanoi {
    public static void main(String[] args) {
        int n = 3;
        toh(n,"Source","Destination","Helper");

    }

    public static void toh(int n,String source,String Destination,String Helper) {

        if(n==0)return;

        toh(n-1,"Source","Helper","Destination");
        System.out.println("Move "+n+"th Disc from " + source + " to "+Destination );
        toh(n-1,"Helper","Destination","Source");


    }
}
