package Algorithms.Sort;
// Time Complexity(Big O Notation) for this algorithm is O(n^2).
// First step of this algortihm is to find max or min value in an array.
// We are going through all the values in an array
// and replacing max or min value, untill we find smallest or biggest one.
// When we find min or max value, we placing it at the start(min) or end(max) of an array.
// In comparison with Bubble sort it better cause of reduced swapping

public class SelectionSort {
    public static void Sort(int nums[]){
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;

        // -1 reducing number of iterations, cause we found the first value
        // i refering to max value, minIndex referring to min
        for(int i=0;i<size-1; i++) {
            minIndex = i;
            for(int j=i+1;j<size;j++) {
                if(nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            // swapping min and max positions in an array
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

            for(int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
