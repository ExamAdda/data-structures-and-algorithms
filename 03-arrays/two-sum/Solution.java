import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexByValue = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];

            if (indexByValue.containsKey(needed)) {
                return new int[] {indexByValue.get(needed), i};
            }

            indexByValue.put(nums[i], i);
        }

        throw new IllegalArgumentException("No valid pair exists");
    }
}
