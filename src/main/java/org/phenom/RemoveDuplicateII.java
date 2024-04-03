package org.phenom;

public class RemoveDuplicateII {
    public static void main(String[] args) {
        String name="abccbaw";
        boolean check=true;
        for (int i = 0; i <name.length()/2 ; i++) {
            if (name.charAt(i)!=name.charAt(name.length()-1-i)){
                check=false;
                break;

            }
        }
        if (check) System.out.println("pali");

        else
            System.out.println("Not pli");
        }
}
