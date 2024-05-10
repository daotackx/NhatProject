// package baiTapMang;

import java.util.HashMap;
import java.util.Map;

public class twoSumArray {

    public static void main(String[] args) {
        int n[] = twoSum(new int[] { 3, 1, 4, 2, 6 }, 8);
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hs = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (hs.containsKey(target - nums[i])) {
                System.out.println(count);
                return new int[] { hs.get(target - nums[i]), i };
            }
            hs.put(nums[i], i);

        }

        throw new IllegalArgumentException("No solution");
    }
}
