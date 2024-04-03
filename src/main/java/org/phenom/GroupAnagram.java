package org.phenom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagram {
    public static List<List<String>> groupAnagram(String[] anagram){
        Arrays.sort(anagram);
        List<List<String>> mainList=new ArrayList<>();
        String anagram2[]=new String[anagram.length];
        for (int i = 0; i <anagram.length ; i++) {
             char ch[]=anagram[i].toCharArray();
             Arrays.sort(ch);
             anagram2[i]=String.valueOf(ch);


        }
        for (int i = 0; i <anagram.length ; i++) {
            List<String> list=new ArrayList<>();
            if (!anagram2[i].equals("0")){
                list.add(anagram[i]);
                for (int j = i+1; j < anagram2.length; j++) {
                    if (anagram2[i].equals(anagram2[j])) {
                        list.add(anagram[j]);
                        anagram2[j] = "0";
                    }
                }
                mainList.add(list);
        }
        }
        return mainList;
    }
    public static void main(String[] args) {
        String[] isAnagram={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagram(isAnagram));

    }
}