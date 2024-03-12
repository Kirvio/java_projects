package Algorithms.Search;
// Time Complexity means measure of how runtime of an algorithm
// increases with the size of the input data
// Big O Notation of this algorithm is O(log n)

// To find value in an Array, in this algorithm we are starting at the mid.
// Then, we are comparing mid value with an actuall value.
// If actuall value is smaller then mid value, we are cutting right half of an array
// and moving mid in the left half, else cutting left half and moving mid to the right.
// Repeat.
// This Algorithm working only with Sorted Integer Values

public class BinarySearch {
    public static int SearchInt(int[] arr, int left, int right, int target)
    {
        // Recursion (Method calls itself again and again, until value is found)
        if(right >= left)
        {
            int mid = left + (right - left) / 2;
            // If the element is present at the
            // middle itself
            if(arr[mid] == target)
                return mid;
            // If element is smaller than mid, then
            // it can only be present in left subarray
            else if(arr[mid] > target) {
                return SearchInt(arr, left, mid-1, target);
            }
            // Else the element can only be present
            // in right subarray
            else {
                return SearchInt(arr, mid+1, right, target);
            }
        }
        // while(left <= right){
        //     int mid = (left + right) / 2;
        //     if(arr[mid] == target) {
        //         return mid;
        //     } else if(arr[mid] > target) {
        //         right = mid - 1; // If mid number is greater then target, ignore right side, go to left
        //     } else {
        //         left = mid + 1; // if mid number is lesser then target, ignore left side, go to the right
        //     }
        // }
        return -1;
    }

    public static int SearchString(String arr[], String target, int left, int right){
        // Recursion (Method calls itself again and again, until value is found)
        int mid = (left + right) / 2;
        if(left <= right) {
            int res = target.compareTo(arr[mid]);
            if(res == 0)
                return mid;
            else if(res < 0)
                return SearchString(arr, target, mid+1, right); // If mid number is greater then target, ignore right side, go to left
            else
                return SearchString(arr, target, left, mid-1); // if mid number is lesser then target, ignore left side, go to the right
        }
        return -1;
    }
}
