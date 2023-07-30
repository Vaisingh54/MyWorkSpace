package LeetCode.BinerySearch;

import java.util.Arrays;

public class CeilingQus2 {

    public static void main(String[] args) {
        int[] arr = { 2, 2 };
        int target = 2;
        int ans[] = { -1, -1 };

        int start = search(arr, target, true);
        int end = search(arr, target, false);

        ans[0] = start;
        ans[1] = end;
        System.out.println(Arrays.toString(ans));
    }

    static int search(int[] nums, int target, boolean ifStart) {

        int n = nums.length;
        int start = 0, end = n - 1, mid = 0, ans = -1;
        while (start <= end) {

            mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (ifStart) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }

}
