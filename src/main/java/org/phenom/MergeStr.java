package org.phenom;

public class MergeStr {
    public static void main(String[] args) {
        String word1="abc"  ,word2="pqri";
        StringBuilder newtString= new StringBuilder();
        int maxLength=Math.max(word1.length(),word2.length());
        for (int i = 0; i <maxLength; i++) {
            if (i<word1.length()){
                newtString.append(word1.charAt(i));
            }
           if  (i<word2.length()){
                newtString.append(word2.charAt(i));
            }
        }
        System.out.println(newtString);


//        String newWord="";
//        for (int i = 0; i <word1.length() ; i++) {
//
//            for (int j = 0+i; i==j ; j++) {
//                newWord=newWord+word1.charAt(i)+word2.charAt(j);
//            }
//        }
//        if (word1.length()>word2.length()){
//            for (int i = word2.length(); i <word1.length() ; i++) {
//                newWord+=word1.charAt(i);
//            }
//        }
//        else{
//            for (int i =word1.length(); i <word2.length() ; i++) {
//                newWord+=word2.charAt(i);
//            }
//        }
//        System.out.println(newWord);
    }
}
