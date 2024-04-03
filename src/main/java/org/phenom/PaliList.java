package org.phenom;

import java.util.Collection;
import java.util.Stack;

public class PaliList {
    Node head;
    Stack stack=new Stack();

    class Node{
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
    void  add(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
        }
        else{
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }
    void printList(){
        if (head==null){
            System.out.println("List is empty");
        }
        else{
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+"--->");
                stack.push(temp.data);
                temp=temp.next;
            }
            System.out.println("NULL");
            System.out.println(stack);
        }
    }
 public boolean isPalindrome(){
        if (head==null||head.next==null){
            return true;
        }
        Node temp=head;
        while (temp!=null){
            if (temp.data!=(int)stack.pop()){
                return false;
            }
            temp=temp.next;
        }
            return true;
 }


    public static void main(String[] args) {
        PaliList paliList=new PaliList();
        paliList.add(12);
        paliList.add(412);
        paliList.add(412);
        paliList.add(12);
        paliList.printList();
//        Stack stack =new Stack();
        boolean palidrom=paliList.isPalindrome();
        System.out.println(palidrom);


    }
}
