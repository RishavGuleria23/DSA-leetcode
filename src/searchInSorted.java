public class searchInSorted {
    public static void main(String[] args) {

    }
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start - (end-start)/2 ;
            for (int i = 0; i < nums.length-1; i++) {
                if(target == nums[i]){
                    return i ;
                }
                else if(target <nums[i]){
                    end=mid-1;

                } else if (target>nums[mid]) {
                    start=mid+1;

                }
                else{
                    return start;
                }

            }

        }


        return -1;
    }
}
