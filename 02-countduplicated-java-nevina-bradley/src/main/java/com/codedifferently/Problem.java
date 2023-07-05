package com.codedifferently;
import java.util.HashMap;
import java.util.Map;

public class Problem {
    public int countDuplicates(String data) {
        Map<Character, Integer> frequency = new HashMap<>();
        int nonUniqueSets = 0;

        for (char c : data.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        for (int count : frequency.values()) {
            if (count > 1) {
                nonUniqueSets++;
            }
        }

        return nonUniqueSets;
    }
}
