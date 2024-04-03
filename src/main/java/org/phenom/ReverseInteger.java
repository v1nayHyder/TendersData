package org.phenom;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReverseInteger {
    public static void main(String[] args) {
        String name="AbscejYGdGjjjAY";
        reverse(name);
//        System.out.println(reverse(name));
    }
    public static void reverse(String x) {
//        Map<Character,Integer> map=new HashMap<>();
//        for (int i = 0; i <x.length() ; i++) {
//            if (Character.isUpperCase(x.charAt(i)))
//            map.put(x.charAt(i),map.getOrDefault(x.charAt(i),0)+1);
//
//        }
//        System.out.println(map);
//        for (Character character:map.keySet()) {
//            if (map.get(character)%2==0){
//                System.out.print(character+" ");
//            }
//        }
//
//        char[] chars=x.toCharArray();
//        Map<Character,Integer> map=new HashMap<>();
//        for (int i = 0; i <chars.length ; i++) {
//            if (Character.isUpperCase(chars[i])){
//                map.put(chars[i],map.getOrDefault(chars[i],0)+1);
//            }
//
//        }
//        System.out.println(map);
//        for (char ch:map.keySet()) {
//            if(map.get(ch)%2==0){
//                System.out.print(ch+" ");
//            }
//        }
        
        
        char[] chars=x.toCharArray();
        for (int i = 0; i <chars.length-1 ; i++) {
            if (Character.isUpperCase(chars[i])&& chars[i]!=0){
                int count=1;
                for (int j = i+1; j <chars.length ; j++) {
                    if (chars[i]==chars[j]){
                        count++;
                        chars[j]=0;
                    }
                }
                if (count%2==0){
                    System.out.print(chars[i]+" ");
                }
            }

        }
    }


}
