// Split into two for loops
// Outer loop will compare each element to the element obtained by the inner loop
// If the elements are equal than output true and exit the loops
// If the elements are false increment the outer loop by one and repeat steps 2 and 3

import java.util.HashSet;
import java.util.Set;

// Utilize sets and hashing
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] arg) {
        int[] nums = {1,3,6,9,5,2,7,1,4};
        String expectedOutput = "true";
        boolean actualOutput = containsDuplicate(nums);
        System.out.println("Expected output is " + expectedOutput + " and actual output is " + actualOutput);
    }
}