package org.phenom;

import java.util.Stack;

public class GenerateParenthesis {
    public static void main(String[] args) {
   String param="([{}])";
        System.out.println(validParenthesis(param));
    }
    static boolean validParenthesis(String param){
        Stack<Character> stack=new Stack<>();
        if (param.length()%2!=0|| param.length()<=1)
            return false;
        for (Character character:param.toCharArray()) {
             if (character=='(')
                 stack.push(')');
             else if (character=='{')
                 stack.push('}');
             else if(character=='[')
                 stack.push(']');
             else if(character!=stack.peek()){
                 return false;
              }
             else {
                 stack.pop();
             }
        }

        return stack.isEmpty();
    }
}
