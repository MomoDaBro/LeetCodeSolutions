import java.util.Arrays;

// Create two for loops
// The outer loop will start at the first element and increment as the loop repeats
// The inner loop will start at the second element and check if the element added to the element found in the outer loop equals to target
// If it is equal return the indices, if not continue iterating
// If the second loop reaches the end increment the first loop and continue checking if the elements add up.
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return new int[]{0,0};
    }

    public static void main(String[] arg) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        String expectedOutput = "[0,1]";
        int[] actualOutput = twoSum(nums, target);
        System.out.println("Expected output is " + expectedOutput + " and actual output is " + Arrays.toString(actualOutput));
    }

}
