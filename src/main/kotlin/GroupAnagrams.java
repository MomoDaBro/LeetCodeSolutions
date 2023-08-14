// Create two loops
// The outer one which loops over the strings in strsList
// The inner one which loops over the existing lists in matches starting at the list with the first element. (eat)
// Compare the incoming string and the existing string in matches to see if they are an anagram
// If true, add the string to the list within matches
// If false, check to see if there is another list already in matches ~ stuck here
// If there is another list, repeat last 3 steps
// If false, add a new array list to the string
// repeat until strs is empty

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> charsToStrings = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            if (charsToStrings.containsKey(sortedString)) {
                List<String> newList = charsToStrings.get(sortedString);
                newList.add(str);
                charsToStrings.put(sortedString, newList);
            } else charsToStrings.put(sortedString, new ArrayList<>(Collections.singleton(str)));
        }
        return new ArrayList<>(charsToStrings.values());
    }


    public static void main(String[] arg) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String expectedOutput = "[[\"bat\"],[\"nat\",\"tan\"],[\"ate\",\"eat\",\"tea\"]]";
        List<List<String>> actualOutput = groupAnagrams(strs);
        System.out.println("Expected output is " + expectedOutput + " and actual output is " + actualOutput);
    }

}
