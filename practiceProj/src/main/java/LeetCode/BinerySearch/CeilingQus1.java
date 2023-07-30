package LeetCode.BinerySearch;

//Smallest char but greater than target, Ignore target element
public class CeilingQus1 {

    public static void main(String[] args) {

        char[] arr = { 'c', 'f', 'j' };
        char target = 'j';
        System.out.println(greaterThanTarget(arr, target));

    }

    static char greaterThanTarget(char[] arr, char target) {

        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end) {

            mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // If not found this opertation will return first element
        return arr[start % arr.length];
    }

}
