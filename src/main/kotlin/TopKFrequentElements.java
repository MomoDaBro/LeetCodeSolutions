// We have a map that holds the frequency of numbers in the nums array
// We want to sort the map then return the top k keys.

import java.util.*;

public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numInNumsToFreq = new HashMap<>();
        for (Integer i : nums)
            numInNumsToFreq.compute(i, (c, oldValue) -> oldValue == null ? 1 : oldValue + 1);

        List<Map.Entry<Integer, Integer>> preSortedList = new ArrayList<>(numInNumsToFreq.entrySet());
        preSortedList.sort(Map.Entry.comparingByValue());

        List<Integer> topKNums = new ArrayList<>();
        for (int i = preSortedList.size(); i > preSortedList.size()-k; i--) {
            topKNums.add(preSortedList.get(i - 1).getKey());
        }
        return topKNums.stream().mapToInt(i -> i).toArray();
    }


    public static void main(String[] arg) {
        int[] nums = {4, 1, -1, 2, -1, 2, 3};
        int k = 2;
        String expectedOutput = "[-1,2]";
        int[] actualOutput = topKFrequent(nums, k);
        System.out.println("Expected output is " + expectedOutput + " and actual output is " + Arrays.toString(actualOutput));
    }

}
