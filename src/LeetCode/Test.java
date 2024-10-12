package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        Integer.compare(intervals[0][0], intervals[0][1]);

        return 0;
    }

    public static int[] twoSum2(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] resultArr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            Integer index = map.get(diff);
            if (index != null) {
                resultArr[0] = index;
                resultArr[1] = i;
                return resultArr;
            }
            map.put(diff, i);
        }

        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
