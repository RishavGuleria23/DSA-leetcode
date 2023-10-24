import java.util.Arrays;

public class leetcode2 {

        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 1};
            System.out.println( findDuplicates(nums));
        }
    public static boolean findDuplicates(int[] nums){
        Arrays.sort(nums);

            for(int index = 0; index<nums.length-1; index++){
                if(nums[index] == nums[index+1] ){
                    return true;
                }
            }

            return false;
        }


    }

