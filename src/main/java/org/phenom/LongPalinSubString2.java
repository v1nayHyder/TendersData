package org.phenom;

import java.util.LinkedList;
import java.util.List;

public class LongPalinSubString2 {
    static String longPalinSubstring(String value) {
        String longPalindromSubstring = "-";

        for (int i = 1; i < value.length(); i++) {
            int low = i;
            int high = i;
            while (value.charAt(low) == value.charAt(high)) {
                low--;
                high++;
                if (low == -1 || high == value.length()) {
                    break;
                }
            }
            String newString = value.substring(low + 1, high);
            if (newString.length() > longPalindromSubstring.length()) {
                longPalindromSubstring = newString;
            }}
            for (int i = 1; i < value.length(); i++) {
                int low = i - 1;
                int high = i;
                while (value.charAt(low) == value.charAt(high)){
                    low--;
                    high++;
                    if (low == -1 || high == value.length()) {
                        break;
                    }
                }
                String newString1 = value.substring(low + 1, high);
                if (newString1.length() > longPalindromSubstring.length()) {
                    longPalindromSubstring = newString1;
                }

            }

        return longPalindromSubstring;

}

    public static void main(String[] args) {
        System.out.println(longPalinSubstring("a"));
    }
}
