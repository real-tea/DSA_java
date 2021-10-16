package recursion;

public class FirstIndex {
    public static void main(String[] args) {
        int arr[] = {3,5,4,5,7,29};
        int size = arr.length;
        int target = 4;
        System.out.println(targetE(arr,size,target));
    }

    public static int targetE(int[] arr,int size,int target) {
        if(size == 0) return -1;
        if(arr[size - 1]==target) return (size - 1);
        return targetE(arr,size - 1,target);
    }
}
