package org.phenom;

public class FirstPalindromeNum {
    public static void main(String[] args) {
        String  pal[]={"abc","car","ada","racecar","cool"};
        for (String str:pal) {
            int temp=0;
            for (int i = 0; i < str.length()/2; i++) {
                if (str.charAt(i)!=str.charAt(str.length()-1-i)){
                    temp=1;
                    break;
                }
            }
            if (temp==0){
                System.out.println(str);
                break;
            }
        }
    }
}
