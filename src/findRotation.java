public class findRotation {
    public static void main(String[] args) {
        int[]arr={2,2,5,0,1,2};
        System.out.println(countRotations(arr));

    }
    static int countRotations(int[]arr){
        int pivot=findPivot(arr);
        return pivot+1;
    }
    static int findPivot(int[]arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (end > mid && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int findPivotWithDupl(int[]arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (end > mid && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] == arr[mid]&& arr[mid]==arr[end]) {
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if (arr[start]<arr[mid ] || arr[start]==arr[mid]&&arr[mid]>arr[end]){
                start=mid+1;
            }
            else{

                end = mid - 1;
            }
        }
        return -1;
}}


