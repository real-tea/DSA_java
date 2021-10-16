package recursion;

public class last_index {
    public static void main(String[] args) {
        int arr[] = {3,29,4,5,7,29};
        int target = 29;
        System.out.println(targetE(arr,arr.length,target));
    }

    public static int targetE(int[] arr,int n,int target) {
       if(n < 0) return -1;
       if(arr[n-1] == target) return n;
       return targetE(arr,n-1,target);
    }
}
