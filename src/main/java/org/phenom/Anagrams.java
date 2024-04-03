package org.phenom;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Anagrams {
    public static boolean anagram(String s,String t){
        if (s.length()!=t.length()){
            System.out.println("false");
        }
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
        for (char c:t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)-1);
            if (map.get(c)<0) {
                System.out.println("f");
                return false;
            }
        }
        System.out.println(map);
//        char ch1[]=s.toCharArray();
//        char ch2[]=s.toCharArray();
//        Arrays.sort(ch2);
//        Arrays.sort(ch1);
//        System.out.println(new String(ch1)+" "+new String(ch2));
//        System.out.println(new String(ch1).equals(new String(ch2)));
//        System.out.println(ch2);
//        System.out.println(ch1.equals(ch2));
//        TreeSet<Character> treeSet=new TreeSet<>();
//        TreeSet<Character> treeSet1=new TreeSet<>();
//        for (int i = 0; i < s.length(); i++) {
//            treeSet.add(s.charAt(i));
//            treeSet1.add(t.charAt(i));
//
//        }
//        System.out.println(treeSet1+" "+treeSet);
//        System.out.println(treeSet1.toString().equals(treeSet.toString()));
return true;
    }

    public static void main(String[] args) {
        anagram("aacc","ccac");
    }
}
