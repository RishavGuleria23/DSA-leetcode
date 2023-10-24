// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class hello{
    public static void main(String[] args) {

        int[]arr = {1,2,3};

        System.out.println(Arrays.toString(reverseArray(arr, 0, arr.length )));
    }
 static int[] reverseArray(int[] arr, int start, int end){
        int temp ;
        while(start>=end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp ;
            reverseArray(arr,start+1,end-1);
        }


     return arr;
 }}
