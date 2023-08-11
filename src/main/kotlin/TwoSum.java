import java.util.*;

// Createa while loop that will terminate when target is found
// Create an inner for loop that will iterate through the array
//
//
//

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (numToIndex.containsKey(target - num)) {
                return new int[]{numToIndex.get(target - num), i};
            }
            numToIndex.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }

    public static void main(String[] arg) {
        int[] nums = {3, 3};
        int target = 6;
        String expectedOutput = "[0, 1]";
        int[] actualOutput = twoSum(nums, target);
        System.out.println("Expected output is " + expectedOutput + " and actual output is " + Arrays.toString(actualOutput));
    }

}
