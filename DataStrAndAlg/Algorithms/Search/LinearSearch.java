package Algorithms.Search;
// In this search algorithm, we are loking for target value
// from start to the end, so, if value is located at the start
// of an array, number of steps performed by this algorithm is 1. O(1)
// Else, number of steps will be equal to the amount of values in an array,
// till we find target.
// Big O Notation of this algorithm is O(n) by default.

public class LinearSearch {
    public static int Search(int nums[], int target){
        int steps = 0;
        for(int i = 0;i<nums.length;i++){
            steps++;
            if(nums[i] == target){
                System.out.println("Number of steps performed by Linear Search " + steps);
                return i;
            }
        }
        System.out.println("Number of steps performed by Linear Search " + steps);
        return -1;
    }
    
}
