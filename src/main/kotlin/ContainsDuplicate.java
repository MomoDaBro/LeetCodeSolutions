// Split into two for loops
// Outer loop will compare each element to the element obtained by the inner loop
// If the elements are equal than output true and exit the loops
// If the elements are false increment the outer loop by one and repeat steps 2 and 3

public class ContainsDuplicate {
    public static boolean containsDup(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i == j) continue;
                if ((nums[i] == nums[j])) return true;
            }
        }
        return false;
    }

    public static void main(String[] arg) {
        int[] nums = {1,3,6,9,5,2,7,1,4};
        String expectedOutput = "true";
        boolean actualOutput = containsDup(nums);
        System.out.println("Expected output is " + expectedOutput + " and actual output is " + actualOutput);
    }
}