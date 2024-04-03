package org.phenom;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class LengthOfLongestSubString {
    public static void main(String[] args) {
        String test = "abcabcbb";
        check(test);
    }

   public static void check(String input){
        HashMap<Character,Integer> map = new HashMap<>();
        int start = 0;
        int max = 0;
         String result = "";
        for(int i =0; i<input.length(); i++ ){
            if(map.containsKey(input.charAt(i))){
                start = map.get(input.charAt(i));
            }
            if(max < i+1-start){
                result = input.substring(start, i+1);
                max = result.length();
            }
            map.put(input.charAt(i), i+1);
        }

        System.out.println("Result = "+result);
    }
}
