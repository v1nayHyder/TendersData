package org.phenom;

public class ASCCuSum {
    public static void main(String[] args) {
        String name="AB";
        int sum=0;
        for (int i = 0; i < name.length(); i++) {
            sum+=name.charAt(i);
        }
        System.out.println(sum);
    }
}
