package org.phenom;

public class TruncateString {
    public static void main(String[] args) {
        String name="Hello how are you Contestant";
        String newString[]=name.split(" ");
      String originalString="";
        for (int i = 0; i <4; i++)
            originalString+=newString[i]+" ";
        System.out.println(originalString.trim());
    }
}
