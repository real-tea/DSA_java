package Problems;

public class accurate_Mountain {
    public static void main(String[] args) {
        int[] mount = {1,5,5};
        boolean f = validMountainArray(mount);
        System.out.println(f);
    }

    public static boolean validMountainArray(int[] arr){
        int n = arr.length;
        int result = 0;
        int i;
        for(i = 0; i < n ; i ++){
            if(arr[i]<arr[i+1]){
                result = 1;
            }else break;
        }
        if(i == n - 1)return false;
        if(result == 1){
            for(int j = i ; j < n ;j++){
                if(arr[j] > arr[j+1])
                    continue;
                else return false;
            }
        }
        else return false;
        return true;
    }
}
