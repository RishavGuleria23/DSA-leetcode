import java.util.Arrays;

public class sumOfUnique {
    public static void main(String[] args) {
        int[]nums={1,2,2,1,3};
        System.out.println(sum(nums));

    }
    public static int sum(int[]nums){

        int sum=0;
        int count;
        for(int i = 0; i < nums.length; i++) {
            count = 0;
            for(int j = 0; j < nums.length; j++) {
                if(i != j && nums[i] == nums[j]) {
                    count++;

                }
            }
            if(count == 0) {
                return nums[i];
            }
        }
        return -1;
    }}
