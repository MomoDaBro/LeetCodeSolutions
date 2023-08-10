// Create two arrays that hold 26 elements for each letter in the alphabet
// Create two separate loops
// The first loop will iterate through string s and increment the corresponding index for the alphabet
// The previous step will be repeated for string t
// Compare both arrays and if they are equal return true otherwise return false

import java.util.Arrays;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] alpha1 = new int[26];
        int[] alpha2 = new int[26];
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();

        for(int i = 0; i < s.length(); i++){
            if(charS[i] == 'a') alpha1[0] += 1;
            if(charT[i] == 'a') alpha2[0] += 1;
            if(charS[i] == 'b') alpha1[1] += 1;
            if(charT[i] == 'b') alpha2[1] += 1;
            if(charS[i] == 'c') alpha1[2] += 1;
            if(charT[i] == 'c') alpha2[2] += 1;
            if(charS[i] == 'd') alpha1[3] += 1;
            if(charT[i] == 'd') alpha2[3] += 1;
            if(charS[i] == 'e') alpha1[4] += 1;
            if(charT[i] == 'e') alpha2[4] += 1;
            if(charS[i] == 'f') alpha1[5] += 1;
            if(charT[i] == 'f') alpha2[5] += 1;
            if(charS[i] == 'g') alpha1[6] += 1;
            if(charT[i] == 'g') alpha2[6] += 1;
            if(charS[i] == 'h') alpha1[7] += 1;
            if(charT[i] == 'h') alpha2[7] += 1;
            if(charS[i] == 'i') alpha1[8] += 1;
            if(charT[i] == 'i') alpha2[8] += 1;
            if(charS[i] == 'j') alpha1[9] += 1;
            if(charT[i] == 'j') alpha2[9] += 1;
            if(charS[i] == 'k') alpha1[10] += 1;
            if(charT[i] == 'k') alpha2[10] += 1;
            if(charS[i] == 'l') alpha1[11] += 1;
            if(charT[i] == 'l') alpha2[11] += 1;
            if(charS[i] == 'm') alpha1[12] += 1;
            if(charT[i] == 'm') alpha2[12] += 1;
            if(charS[i] == 'n') alpha1[13] += 1;
            if(charT[i] == 'n') alpha2[13] += 1;
            if(charS[i] == 'o') alpha1[14] += 1;
            if(charT[i] == 'o') alpha2[14] += 1;
            if(charS[i] == 'p') alpha1[15] += 1;
            if(charT[i] == 'p') alpha2[15] += 1;
            if(charS[i] == 'q') alpha1[16] += 1;
            if(charT[i] == 'q') alpha2[16] += 1;
            if(charS[i] == 'r') alpha1[17] += 1;
            if(charT[i] == 'r') alpha2[17] += 1;
            if(charS[i] == 's') alpha1[18] += 1;
            if(charT[i] == 's') alpha2[18] += 1;
            if(charS[i] == 't') alpha1[19] += 1;
            if(charT[i] == 't') alpha2[19] += 1;
            if(charS[i] == 'u') alpha1[20] += 1;
            if(charT[i] == 'u') alpha2[20] += 1;
            if(charS[i] == 'v') alpha1[21] += 1;
            if(charT[i] == 'v') alpha2[21] += 1;
            if(charS[i] == 'w') alpha1[22] += 1;
            if(charT[i] == 'w') alpha2[22] += 1;
            if(charS[i] == 'x') alpha1[23] += 1;
            if(charT[i] == 'x') alpha2[23] += 1;
            if(charS[i] == 'y') alpha1[24] += 1;
            if(charT[i] == 'y') alpha2[24] += 1;
            if(charS[i] == 'z') alpha1[25] += 1;
            if(charT[i] == 'z') alpha2[25] += 1;
        }

        return Arrays.equals(alpha1, alpha2);
    }

    public static void main(String[] arg) {
        String s = "anagram";
        String t = "nagaram";
        String expectedOutput = "true";
        boolean actualOutput = isAnagram(s, t);
        System.out.println("Expected output is " + expectedOutput + " and actual output is " + actualOutput);
    }
}
