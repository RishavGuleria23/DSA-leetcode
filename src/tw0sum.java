import java.util.Arrays;

public class tw0sum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 26;
        System.out.println(Arrays.toString(twoSum1(nums,target)));

    }
            public static int[] twoSum1(int[] nums, int target) {

                int n = nums.length;
                for (int i = 0; i < n - 1; i++)
                    for (int j = i + 1; j < n; j++) {
                        if (nums[i] + nums[j] == target) {
                            return new int[]{i, j};

                        }

                    }

                return new int[]{-1,-1};
            }}










