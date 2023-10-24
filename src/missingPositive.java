public class missingPositive {
    static int cycleSort(int[]nums){
    //firstly for sorting the array
    int i = 0;
    while(i<nums.length){
        int correct = nums[i]-1;//correct is arr[i]-1 in cycle sort but in this problem where range is 0,N
        if(nums[i]>0 && nums[i] <= nums.length && nums[i] != nums[correct]){
            swap(nums,i,correct);
        }
        else{
            i++;
        }
    }
    //for finding the missing number
    for (int index = 0; index <nums.length ; index++) {
        if(nums[index] != index+1){
            return index+1;

        }

    }


    return nums.length+1;//for case 2 ,if N is not present in array return the length of array as answer
}

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start]= arr[end];
        arr[end]=temp;
    }
}
