package recursion;

public class arraySorted {
    public static void main(String[] args) {

        int [] arr = {3,6,7,10,13};
        int size = arr.length;
        System.out.println(isSorted(arr,size ));
    }

    public static boolean isSorted(int[] arr,int size) {
        if(size == 1 || size == 0) return true;
        if(arr[size - 1] < arr[size - 2])return false;
        return isSorted(arr,size - 1);
    }
}
