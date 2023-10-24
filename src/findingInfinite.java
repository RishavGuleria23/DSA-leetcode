// FINDING IN INFINITE ARRAY
public class findingInfinite{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        int target = 13;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1)*2;//here we need the old value of start that why we are changing
            start = temp;//here the value and updating it over

        }
        return binaSearch(arr,target,start,end);
    }

    static int binaSearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start )/ 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }





    }
        return -1;
    }}


