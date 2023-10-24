import java.util.Arrays;

public class sumTwo {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int target = 7;
        System.out.println(Arrays.toString(sumOfInt(arr, target)));
    }

    public static int[] sumOfInt(int[] arr, int target) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum == target) {
                    return new int[]{i, j};
                } else {
                    i++;
                }

            }

        }
        return new int[]{-1, -1};
    }
}
    
      

  


