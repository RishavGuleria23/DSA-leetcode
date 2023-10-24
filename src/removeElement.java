public class removeElement {
    public static void main(String[] args) {
        int nums[]={3,2,2,3};
        System.out.println(remove(nums,3));

    }

    static int remove(int [] nums, int val){
        int cnt=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != val) {
                nums[cnt++] = nums[i];
            }
        }return cnt;
    }
}
