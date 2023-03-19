package LeetCode;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = { 3, 2, 4 };
        int target = 6;

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

        for (int k = 0; k < 2; k++) {
            System.out.println(result[k]);
        }
    }

}
