package org.phenom;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

class Solution1 {
    public static String mostCommonWord(String paragraph, String[] banned) {
//        String name[]=paragraph.replace(",","").replace(".","").split(" ");
        String[] name= paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase().split("\\s+");
        System.out.println(Arrays.toString(name));
        Map<String ,Integer> map=new LinkedHashMap();
        for(String str:name){
            if(banned.length>0){
            for(String val:banned){
                if(!val.equalsIgnoreCase(str))
                    map.put(str.toLowerCase(),map.getOrDefault(str.toLowerCase(),0)+1);
            }
            }
            else{
                    map.put(str.toLowerCase(),map.getOrDefault(str.toLowerCase(),0)+1);
            }

        }
        System.out.println(map);
        int max=Integer.MIN_VALUE;
        String check="";
        for(String str:map.keySet()){
            if(max<map.get(str)){
                max=map.get(str);
                check=str;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        System.out.println(mostCommonWord("a.", new String[]{}));
    }
}