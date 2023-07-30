package LeetCode.Arrays;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = { 3, 2, 4, 6, 5, 1 };
        int target = 17;

        twoSum(nums, target);

    }

    public static void twoSum(int[] nums, int target) {

        int n = nums.length - 1;
        int[] result = new int[2];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        if (result[0] == 0 && result[1] == 0)
            System.out.println("Not found");
        else
            System.out.println(Arrays.toString(result));
    }

}
