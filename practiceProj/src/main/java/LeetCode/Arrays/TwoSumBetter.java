package LeetCode.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSumBetter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] nums = { 1, 2 };

        int target = sc.nextInt();
        System.out.println(Arrays.toString(findTwoNum(nums, target)));
        sc.close();
    }

    /**
     * @param nums
     * @param target
     * @return
     */
    public static int[] findTwoNum(int[] nums, int target) {

        final HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        final int len = nums.length;
        for (int i = 0; i < len; i++) {
            int x = nums[i];
            if (map.containsKey(target - x)) {
                return new int[] { map.get(target - x), i };
            }
            map.put(x, i);
        }
        throw new IllegalArgumentException("No mumber found");

    }

}
