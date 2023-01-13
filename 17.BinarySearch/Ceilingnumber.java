//package BinarySearch;

public class Ceilingnumber {
//    Sorted array - >  Binary Search
//    Continuous sequence of a number given

    public static int ceiling(int [] arr, int target){
        int start=0;
        int end=arr.length-1;
        if (target>arr[arr.length-1]){
            return -1;
        }

        while (start<=end){
//            find the middle element
            int mid = start+(end-start)/2;
            if (target<arr[mid]){
                end = mid-1;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
    public static int floor(int [] arr, int target){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
//            find the middle element
            int mid = start+(end-start)/2;
            if (target<arr[mid]){
                end = mid-1;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return end ;
    }
    public static void main(String[] args){
        
    }
}
