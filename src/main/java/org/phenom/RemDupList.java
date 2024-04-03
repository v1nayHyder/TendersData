package org.phenom;
class Node{
    int data;
    Node link;

    public Node(int data) {
        this.data = data;
    }
}
public class RemDupList {
//    public
public static void printList(Node head){
    if (head==null){
        System.out.println("List is empty");
    }
    else {
        Node newNode=head;
        while (newNode!=null){
            System.out.print(newNode.data+" ");
            newNode=newNode.link;
        }

    }
}
public Node removeDuplicate(Node head) {
    if (head == null || head.link == null) {
        return head;
    }
    Node current = head;
    while (current != null && current.link != null) {
        if (current.data==current.link.data){
            current.link=current.link.link;
        }
        else {
            current=current.link;
        }
    }
    return head;
}
    public static void main(String[] args) {
        Node head=new Node(1);
        head.link=new Node(1);
        head.link.link=new Node(2);
        head.link.link.link=new Node(2);
        head.link.link.link.link=new Node(3);
        head.link.link.link.link.link=new Node(3);
        head.link.link.link.link.link.link=new Node(3);
        System.out.println("Orignal list : ");
        printList(head);
        RemDupList remDupList=new RemDupList();
        Node newNode=remDupList.removeDuplicate(head);
        System.out.println("list without duplicacy");
        printList(newNode);

    }
}