public class misMatch {
    static int[] cycleSort(int[]nums){
    int i = 0;
        while(i<nums.length){
        int correct = nums[i]-1;//correct is arr[i]-1 in cycle sort but in this problem where range is 0,N
        if(nums[i] < nums.length && nums[i] != nums[correct]){
            swap(nums,i,correct);
        }
        else{
            i++;
        }
    }
    //for finding the missing number
        for (int index = 0; index <nums.length ; index++) {
        if(nums[index] != index+1) {
            return new int[]{nums[index], index + 1};
        }


        }
        return new int[]{-1,-1};
    }

            static void swap(int[] arr, int start, int end) {
                int temp = arr[start];
                arr[start]= arr[end];
                arr[end]=temp;
            }}
