package org.phenom;

import java.util.Stack;

public class TestClass {
    public static void main(String[] args) {
        System.out.println(validParenthesis("()[]{}"));
    }
    static boolean validParenthesis(String s){
        Stack<Character> stack=new Stack();
        for (char ch:s.toCharArray()) {
            if (ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }
            else {
                if (stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if (ch==')'&& top!='('||ch=='}'&& top!='{'||ch==']'&& top!='['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}