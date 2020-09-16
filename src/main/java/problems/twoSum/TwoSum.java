package problems.twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i]; // 6 - 3 = 3
            if (map.containsKey(result)) {
                return new int[]{map.get(result), i};
            }
            map.put(nums[i], i); // 3, 0
        }
        throw new IllegalArgumentException("NOP");
    }

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{3, 3}, 6);
        System.out.println(Arrays.toString(ints));
    }
}
