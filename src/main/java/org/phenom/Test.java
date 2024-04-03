package org.phenom;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
       String name="aabddcceeeeejee";
       Map<Character,Integer> map=new HashMap();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (char c:name.replace(" ","").toLowerCase().toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        char miChar=' ';
        char maxChar=' ';
        for (char c:map.keySet()) {
            int val=map.get(c);
            System.out.println(map.get(c));
            if (min>val){
                min=val;
                miChar=c;
            }
            if (max<val){
                max=val;
                maxChar=c;
            }
        }

        System.out.println(map);
        System.out.println(miChar);
        System.out.println(maxChar);

    }
}
