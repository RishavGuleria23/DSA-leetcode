public class splitArray {
    public static void main(String[] args) {
        int[]arr= {7,2,5,10,8};
        int m = 2;
        System.out.println(split(arr,m));

    }
    static int split(int[] nums, int m){
        int start=0;
        int end=0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);//will contain max value in array
            end += nums[i];//will give the sum of all values in array

        }
        while (start<end){
            int mid= start+(end-start)/2;// for potential ans in middle element among min and max values
            int sum = 0;
            int pieces= 1;//calculate pieces in which it can be divided(subarray)with max sum
            for(int num: nums) {
                if (sum + num > mid) {
                    //therefore we cannot add this into subarray, make a new subarray of less than it
                    sum = num;//add this to new subarray
                    pieces++;//number of pieces would be increased
                } else {
                    sum += num;
                }}
                if (pieces > m) {
                    start = mid + 1;
                } else
                    end = mid;




            }
              return start;

        }
}


