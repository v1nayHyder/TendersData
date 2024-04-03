package org.phenom;

import java.util.Scanner;

public class AddNodeNthPosition {
    ListNode head;

    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.println("NULL");
    }
    void removeNodeNthPosition(int pos,int nodeData){
        if (head==null){
            System.out.println("List is Empty");
            return;
        }
        ListNode newNode=new ListNode(nodeData);
        System.out.println(newNode.data);
        ListNode current=head;
        int count=1;
        while (count++!=pos-1){
            current=current.next;

        }

        ListNode nextNode=current.next;
        current.next=newNode;
        newNode.next=nextNode;


        System.out.println(current.data);
        System.out.println();


    }


    public static void main(String[] args) {
        AddNodeNthPosition addNodeNthPosition = new AddNodeNthPosition();
        addNodeNthPosition.head = new ListNode(45);
        ListNode second = new ListNode(23);
        ListNode third = new ListNode(56);
        ListNode fourth = new ListNode(99);

       addNodeNthPosition.head.next = second;
        second.next = third;
        third.next = fourth;
       addNodeNthPosition.printList();
        System.out.print("Enter the node position : ");
        Scanner scanner=new Scanner(System.in);
        int position=scanner.nextInt();
        System.out.print("Enter the node data : ");
        int nodeData=scanner.nextInt();
        addNodeNthPosition.removeNodeNthPosition(position,nodeData);
        addNodeNthPosition.printList();



    }
}
