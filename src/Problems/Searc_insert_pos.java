package Problems;

public class Searc_insert_pos {
    public static void main(String[] args) {
        int[] array = {1};
        int target = 0;
        int result = searchInsert(array,target);
        System.out.println(result);
    }

    public static int searchInsert(int[] nums, int target) {
        int s=0;
        int end=nums.length;
        int res=binary(nums,s,end,target);
        return res;
    }
    public static int binary(int[]a,int s,int e,int t){
        int mid=0;
        while(s<e){
            mid=s+(e-s)/2;
            if(a[mid]==t)
                return mid;
            else if(t>a[mid]){
                s=mid+1;
            }
            else{
                e=mid;
            }

        }
        if(a[mid]<t)
            return mid+1;
        return mid;
    }
}

