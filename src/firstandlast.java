public class firstandlast {
    public static void main(String[] args) {

    }

        public static int[] searchrange (int[] nums, int target){
            int[] ans = {-1, -1};
            int start = search1(nums, target, true);
            int end = search1(nums, target, false);
            ans[0] = start;
            ans[1] = end;
            return ans;
        }


       public static int search1 ( int[] nums, int target, boolean firstindex){
            int ans = -1;
            int start = 0;
            int end = nums.length - 1;
            while (start <= end) {
                int mid = start + end - start / 2;
                if (target < nums[mid]) {
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;

                } else {
                    ans = mid;
                    if (firstindex == true) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
            return ans;

        }
    }

