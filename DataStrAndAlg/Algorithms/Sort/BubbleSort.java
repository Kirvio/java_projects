package Algorithms.Sort;
// Time Complexity(Big O Notation) for this algorithm is O(n^2).
// This algorithm iterates through the values in an array,
// compares two values and swapping them, until an array is sorted.
// It does not know what values are sorted already, so it does
// number of unnecessary iterations equal to a size of an array
// Big issue of this algorithm is swapping, every time we do an iteration
// in an inner loop we swapping values multiple times, it consumes
// a lot of time and memory.

public class BubbleSort {
    public static void Sort(int nums[]){

        int size = nums.length;
        int temp = 0;

        for(int i=0;i<size;i++) {
            // Take one element, place it into bubble, shift it to the end
            // -i for not checking value again, when we placed it at the end 
            for(int j=0;j<size-i-1;j++) {
                // comparing two values at a time
                if(nums[j] > nums[j+1]) {
                    // if previous value is bigger then next value, swap it
                    temp = nums[j];
                    nums[j] = nums[j+1]; // swapping values
                    nums[j+1] = temp;
                }
            }
        }
    }
}
