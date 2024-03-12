package Algorithms.Sort;

// Big O notation - O(n log(n)), stable sorting algorithm, with exceptional performance
// Divide and Conquer, Recursion, then merge
// we break down an array into smaller parts
// In quick sort we use Pivot, here we use Medium
// m=(left+right)/2

public class MergeSort {

    public static void Sort(int[] arr)
    {
        int low = 0;
        int high = arr.length-1;
        mergeSort(arr, low, high);
    }

    private static void mergeSort(int[] arr, int low, int high)
    {
        // While there is an array, do recursion
        if(low<high)
        {
            // Our Medium, by which we dividing an array logically
            int mid = (low+high)/2;

            mergeSort(arr, low, mid); // Sort first half
            mergeSort(arr, mid+1, high); // Sort second half

            // First this algorithm breaking down and merges left side of the first array
            // (it does not know about second(right) array yet)
            // when it finished breaking down and merging first part,
            // it goes for right part of the first(left) array.
            // After its finished, it does same operation with a second part of an array
            // from left to right.
            // At the end it merges merged parts into main sorted array.
            merge(arr, low, mid, high);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high)
    {

        int i=0; // First array counter
        int j=0; // Second array counter
        int k=low; // Main array counter

        // Getting a size of an arrays

        // Size of the first(left) array starts from low
        // (+1 cause mid represents indexing)
        int n1 = mid - low + 1;

        // Size of the second(right) array starts from mid
        int n2 = high - mid;

        // Creating left and right array
        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

        // Copying values for first(left) array
        for(int x=0;x<n1;x++)
        {
            lArr[x]=arr[low+x];
        }

        // Copying values for second(right) array
        for(int x=0;x<n2;x++)
        {

            // (mid + 1) because we are not considering a mid value for next array
            // when we dividing an array into two parts
            // if mid value at index 2, we start at index 3
            rArr[x]=arr[mid+1+x];

        }

        // Merge logic
        // Do operation untill we reach the end of current part
        while(i<n1 && j<n2) 
        {

            // Comparing values
            if(lArr[i]<=rArr[j]) {

                // If left value is smaller or equal, put it into main array
                arr[k]=lArr[i];

                // When we are done, shift lArr value reference to the right(i=i+1)
                i++;
            } else {

                // Doing same thing as above for second(right) array
                arr[k]=rArr[j];
                j++;

            }

            // After iteration of this loop,
            // we'll get first value of the main array
            // Once i or j is done, moving k index on one position
            k++;
        }

        // Remaining values from the first array should go at the end
        // For remaining elements of the particular array,
        // we again run a while loop
        while(i<n1) arr[k++]=lArr[i++];  // Copy remaining elements
        while(i<n2) arr[k++]=rArr[j++];  // Same thing as above for second array
    }

}
