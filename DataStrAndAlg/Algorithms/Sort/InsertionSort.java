package Algorithms.Sort;
// Time Complexity(Big O Notation) for this algorithm is O(n) or in worst cases O(n^2).
// Shifting algorithm
// In this algorithm, we are comparing one value from an array
// with all other values in an array.
// If previous value is bigger then next value,
// then we shifting position of previous value to the next(Shifting)

public class InsertionSort {
    public static void Sort(int nums[]){
        int size = nums.length;
        int temp = 0;
        int j = 0;

        for(int i=1;i<size;i++) {
            temp=nums[i];
            j=i-1;
            while(j>=0 && nums[j]>temp) {
                // Shifting
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=temp;
            System.out.println();
            for(int num : nums){
                System.out.print(num + " ");
            }
        }
    }
}
