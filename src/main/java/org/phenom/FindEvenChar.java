package org.phenom;

public class FindEvenChar {
    public static void main(String[] args) {
        String name="Vinay aPrakash Yadav";
        String s="";
        StringBuilder dummyString=new StringBuilder(name.toLowerCase());
        System.out.println(dummyString);
        for (int i = 0; i <dummyString.length() ; i++) {
            int temp=1;
            for (int j = i+1; j <dummyString.length() ; j++) {
                if (dummyString.charAt(i)==dummyString.charAt(j) && dummyString.charAt(j)!='0'){
                    temp++;
                   dummyString.setCharAt(j,'0');
                }

            }
            if (temp%2==0){
//                System.out.println(temp);
                System.out.println(dummyString.charAt(i));
                s+=dummyString.charAt(i);
            }
        }
        System.out.println(s);
        System.out.println(name);
        System.out.println(dummyString);
    }

}