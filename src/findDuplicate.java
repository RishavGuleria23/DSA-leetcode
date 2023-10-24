import java.util.ArrayList;
import java.util.List;

public class findDuplicate {
    public static void main(String[] args) {
        int []nums={1,2,3,4};
        System.out.println(findDuplicate(nums));
    }

        public static List<Integer> findDuplicate(int[] nums) {

            int i=0;
            while(i<nums.length){
                int correct = nums[i]-1;
                if(nums[i] != nums[correct]){
                    swap(nums,i,correct);
                } else
                    i++;
            }
            List <Integer> ans= new ArrayList<>();
            for(int index = 0; index<nums.length ; index++){
                if(nums[index] != index+1){
                    ans.add(nums[index]);
                }
            }
            return ans;
        }
        public static void swap(int[] arr, int start, int end) {
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]=temp;
        }


    }

