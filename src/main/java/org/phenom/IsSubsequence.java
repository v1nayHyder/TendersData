package org.phenom;

public class IsSubsequence {
    public static void main(String[] args) {
        String val1="abc";
        String val2="ahbgdc";
        boolean result=isSubsequence(val1,val2);
        System.out.println(result);
    }
    public static boolean isSubsequence(String str1,String str2){
        int index1=0,index2=0;
        while (index1<str1.length()&&index2<str2.length()){
            if (str1.charAt(index1)==str2.charAt(index2)){
                index1++;
            }
            index2++;
        }

 return str1.length()==index1;
    }
}
