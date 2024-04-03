package org.phenom;

import java.util.Stack;

public class PalindromeList2 {
    Stack stack=new Stack();
      class Node{
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }

    }
    boolean printList(Node head){

              Node temp=head;
              while (temp!=null){
                  System.out.print(temp.data+"--->");
                  stack.push(temp.data);
                  temp=temp.next;
              }
//              System.out.println("NULL");

//        System.out.println(stack);{
        if (head==null||head.next==null){
            return true;
        }
                Node temp1=head;
        while (temp1!=null){
            int value=(int)stack.pop();
            if (temp1.data!=value){
                return false;
            }
            temp1=temp1.next;

        }
          return true;

    }
//    boolean check(Node head){
//        Node temp=head;
//        while (temp!=null){
//            int value=(int)stack.pop();
//            if (temp.data!=value){
//                return false;
//            }
//            temp=temp.next;
//
//        }
//          return true;
//    }
    public static void main(String[] args) {
          PalindromeList2 palindromeList2=new PalindromeList2();
        Node head=palindromeList2.new Node(67);
        head.next=palindromeList2.new Node(45);
        head.next.next=palindromeList2.new Node(45);
        head.next.next.next=palindromeList2.new Node(45);
        head.next.next.next.next=palindromeList2.new Node(67);
      boolean check=  palindromeList2.printList(head);
        System.out.println(check);
//        boolean value=palindromeList2.check(head);
//        System.out.println(value);

    }
}
