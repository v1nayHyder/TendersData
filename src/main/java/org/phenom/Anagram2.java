package org.phenom;

import java.util.HashMap;
import java.util.Map;

public class Anagram2 {
    public static boolean anagram(String s,String t){
        if (s.length()!=t.length())
            return false;
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (char c:t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)-1);
            if (map.get(c)<0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(anagram("ccac","aacc"));
    }
}
