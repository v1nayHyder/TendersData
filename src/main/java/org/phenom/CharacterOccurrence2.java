package org.phenom;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class CharacterOccurrence2 {
    public static void main(String[] args) {
        String name="abbbdddrrrd ".replace(" ","").toLowerCase();
        char newName[]=name.toCharArray();
        Arrays.sort(newName);
        System.out.println(Arrays.toString(newName));
        System.out.println(name);
        int count;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        Map map=new LinkedHashMap();
        for (int i = 0; i <newName.length ; i++) {
            count=1;

            if (!map.containsValue(newName[i])){
                for (int j = i+1; j <newName.length ; j++) {
                    if (newName[i]==newName[j]){
                        count++;
                    }
                    else {
                        break;
                    }
                }
                min=Math.min(min,count);
                max=Math.max(max,count);
                map.put(count,newName[i]);


            }
        }
        System.out.println("min="+map.get(min));
        System.out.println("max="+map.get(max));

    }
}