package org.phenom;

import java.util.Scanner;

public class RemoveNode {
     Node  head;
  class Node{
        int data;
        Node next;

       public Node(int data) {
           this.data = data;
       }
   }
     void insert(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
        }
        else {
            Node current=head;
         while (current.next!=null){
             current=current.next;
         }
            current.next=newNode;

        }

    }
    void display(){
      if (head==null){
          System.out.println("List is empty");
      }
      else {

          Node currentNode=head;
          while (currentNode!=null){
              System.out.print(currentNode.data+"-->");
              currentNode=currentNode.next;
          }
          System.out.println("NULL");
      }
    }
    void remove(int val) {
        if (head == null) {
            return;
        }

        while (head != null && head.data == val) {
            head = head.next;
        }

        Node currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.next.data == val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
    }

    public static void main(String[] args) {
    RemoveNode removeNode=new RemoveNode();
    removeNode.insert(23);
    removeNode.insert(23);
    removeNode.insert(2309);
    removeNode.insert(23);
    removeNode.insert(45);
        removeNode.insert(23);

    removeNode.display();
    System.out.print("Please enter your number which you want to delete : ");
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    removeNode.remove(number);
    removeNode.display();
    }
}