//BINARY SEARCH,CEILING AND FLOOR

// CEILING
public class binarySearch {
    public static void main(String[] args) {
        int []arr={2,3,5,9,14,16,18};
        int target = 15;
        int tar = 8;
        int target3=9;
        int []arr2={2,3,5,9,14,16,18};
        int ans= ceiling(arr,target);
        System.out.println(ans);
        int ans2=floor(arr2,tar);
        System.out.println(ans2);
        int ans3= binasearch(arr2,target3);
        System.out.println(ans3);
    }
    static int ceiling(int[]arr,int target){
    int start = 0 ;
    int end = arr.length-1;
    while(start<=end){
        int mid = start + end-start/2;
    if(target < arr[mid]){
        end=mid-1;
    } else if (target>arr[mid]) {
        start=mid+1;
    }
    else{
        return mid;
    }

    }
    return start;

    }

//FLOOR of the element
static int floor(int []arr2,int tar){
        int start = 0;
        int end = arr2.length-1;

        while(start<=end){
            int mid = start  + end-start/2;

            if(tar<arr2[mid]){
                end= mid-1;

            } else if (tar>arr2[mid]) {
                start = mid +1;
            }
            else{
                return mid;
            }

        }
        return end;
    }
    //BINARY SEARCH
    static int binasearch(int[]arr,int target){
        int start = 0 ;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else{
                return mid;
            }

        }
        return -1;


    }
}
