package org.phenom;

public class StartWith {
    public static void main(String[] args) {
        String[] words={"leetcode","win","loops","success"};
        String prefix="code";
        int count=0;
        for (String word:words) {
            if (word.startsWith(prefix)){
                count++;
            }
        }
        System.out.println(count);
    }
}
