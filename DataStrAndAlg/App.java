// Time Complexity means measure of how runtime of an algorithm
// increases with the size of the input data

import Algorithms.Search.BinarySearch;
import Algorithms.Sort.MergeSort;

public class App {
    public static void main(String[] args) {

        // Array is a static data structure with a fixed size
        int[] arr = {24, 11, 7, 8, 15, 1, 12, 5, 88, 9};
        // String arr[] = {"Egor", "Vanya", "Batman", "Joker"};
        // If we want to insert or add new values to existing structure
        // we can use LinkedList, it is mutable
        // {13,2,5,18,9,16,1,6}
        int target = 7;
        //int result, result1;
        int length = arr.length;
        int result;
        // String target = "Batman";
        System.out.println("Before sorting: ");

        for(int num : arr){
            System.out.print(num + " ");
        }

        MergeSort.Sort(arr);
        System.out.println();
        System.out.println("After sorting: ");

        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        //LinearSearch search = new LinearSearch();
        //result = search.Search(arr, target);
        result = BinarySearch.SearchInt(arr, 0, length-1, target);
        //result1 = LinearSearch.Search(arr, target);
        if(result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result + " Binary ");
            //System.out.println("Element found at " + result1 + " Linear ");
        }
    }
}
