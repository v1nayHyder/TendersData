package org.phenom;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReverseVowels {

    public static String reverseVowels(String s) {
        int start=0;
        int end=s.length()-1;
        char[] chars=s.toCharArray();
        List<Character> list= Arrays.asList('a','e','i','o','u','A','E','I','U','O');
        String str="aeiouAEIOU";

        while (start<end)
        {
          if(!list.contains(chars[start])){
              start++;
          }
          else if (!list.contains(chars[end])){
              end--;
          }
          else if (list.contains(chars[start])&&list.contains(chars[end])) {
              char ch = chars[start];
              chars[start] = chars[end];
              chars[end] = ch;
              start++;
              end--;
          }
        }
      return String.valueOf(chars);

    }
//        char[] chars=s.toCharArray();
//        int start=0;
//        int end=s.length()-1;
//        while (start < end) {
//            if (!isVowel(chars[start])) {
//                System.out.println(isVowel(chars[start]));
//                start++;
//            }
//            else if (!isVowel(chars[end])){
//                System.out.println(isVowel(chars[end]));
//                end--;}
//            else {
//                char ch=chars[start];
//                chars[start]=chars[end];
//                chars[end]=ch;
//                start++;
//                end--;
//            }
//        }
//        return String.valueOf(chars);
//    }
//
//    static boolean isVowel(char ch){
//        if (ch=='a'|| ch=='e'||ch=='i'|| ch=='o'||ch=='u'){
//         return true;
//        }
//        if (ch=='A'|| ch=='E'||ch=='I'|| ch=='O'||ch=='U'){
//            return true;
//        }
//        return false;
//    }

        public static void main(String[] args) {
            System.out.println(reverseVowels("aA"));
            System.out.println(reverseVowels("leetcode"));
        }
}





