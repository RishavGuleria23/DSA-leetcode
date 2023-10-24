import java.util.Arrays;

public class split {
    public static void main(String[] args) {
        int[]nums={13,25};
        System.out.println(Arrays.toString(nums));

    }
    public int[] separateDigits(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > 9) {
                return new int[]{nums[i] % 10};
            }
            if (nums[i] < 9) {
                return new int[]{nums[i]};
            }
        }
                return new int[]{-1};



    }}


