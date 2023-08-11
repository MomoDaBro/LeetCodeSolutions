// Create two arrays that hold 26 elements for each letter in the alphabet
// Create two separate loops
// The first loop will iterate through string s and increment the corresponding index for the alphabet
// The previous step will be repeated for string t
// Compare both arrays and if they are equal return true otherwise return false

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> lettersInSToFreq = new HashMap<>();
        for (char letter : s.toCharArray()) {
            lettersInSToFreq.compute(letter, (c, oldValue) -> oldValue == null ? 1 : oldValue + 1);
        }

        for (char letter : t.toCharArray()) {
            lettersInSToFreq.compute(letter, (c, oldValue) -> oldValue == null ? -1 : oldValue - 1);
        }

        return lettersInSToFreq.values().stream().allMatch(num -> num == 0);
    }

    public static void main(String[] arg) {
        String s = "anagram";
        String t = "nagaram";
        String expectedOutput = "true";
        boolean actualOutput = isAnagram(s, t);
        System.out.println("Expected output is " + expectedOutput + " and actual output is " + actualOutput);
    }
}
