package org.phenom;

import java.util.ArrayList;
import java.util.List;
 class Solution {
    public String[] splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            String[] splitWords = word.split("\\Q" + separator + "\\E");

            for (String splitWord : splitWords) {
                if (!splitWord.isEmpty() && !splitWord.equals(String.valueOf(separator))) {
                    result.add(splitWord);
                }
            }
        }

        return result.toArray(new String[0]);
    }
}
