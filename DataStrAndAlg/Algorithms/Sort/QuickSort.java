package Algorithms.Sort;

// Big O Notation in this algorithm in best case O(n log(n)), average

// Divide and Conquer, Recursion, Pivot.

// First step is to choose Pivot value, usually last value.
// Then, we are doing Divide and Conquer, wich includes dividing an array into
// logical parts, and, after performing sorting on each part,
// we merge it back together(logically)

public class QuickSort {

    public static void Sort(int[] num) {

        int low = 0;

        // Array indexing starts from 0, so we doing -1
        int high = num.length-1;
        System.out.println(high);
        QSort(num, low, high);

    }

    // Parameters: an array, starting and ending point of each section
    private static void QSort(int[] num, int low, int high) {

        int pi;

        // Recursion happening only untill low < high
        if( low < high )
        {
            // Logically dividing an array basing on pi(returned Pivot) value
            pi = Partition(num, low, high);

            // When we creating new logical partitions,
            // we do not want to include pi.
            // So, first partition ends with pi-1, second starts with pi+1 index
            QSort(num, low, pi-1);
            QSort(num, pi+1, high);
        }

    }

    private static int Partition(int[] num, int low, int high) {

        //Initializing Pivot as the last value of this particular partition
        int Pivot = num[high];

        // If low = 0, then i must be -1 for this algorithm
        int i = low - 1;

        // Creating loop to search for value lower then Pivot in each partition
        // Every new partition is starting from low index(0, 5, etc)
        for(int j=low;j<high;j++)
        {

            // If current num[j] value lesser then Pivot
            // Ascending sort
            if(num[j] < Pivot)
            {
                // Increasing start position
                i++;

                // Swapping num[i] and num[j] position values
                swap(num, i, j);
            }
        }

        // When no values are lower, j goes to the last value
        // j ends at high, so Pivot and num[j] are same values at this moment.
        // By doing this swap, we ensure that Pivot value is at the right position.
        // Right side of an array always greater then left in this case.
        swap(num, i+1, high);

        // Returning new Pivot index
        return i+1;

    }

    private static void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}
