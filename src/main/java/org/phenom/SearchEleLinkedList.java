package org.phenom;

public class SearchEleLinkedList {
      Node head,tails;
        class Node{
            int data;

            Node next;
            public Node(int data) {
                this.data = data;
            }
        }
        void add(int data){
           Node newNode=new Node(data);
            if (head==null){
                head=newNode;
                tails=newNode;
                return;
            }
            tails.next=newNode;
            tails=newNode;
        }
        void printList(){
            Node current=head;
            while (current!=null){
                System.out.print(current.data+"--->");
                current=current.next;
            }
            System.out.println("NULL");
        }
        void insertFirst(int data){
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;
        }
        int searchEle(int data){

            if (head==null){
                return 0;

            }
            else {
                Node current = head;
                while (current!=null){
                    if (current.data==data){
                        return  current.data;
                    }
                    current=current.next;
                }
            }
            return 0;
        }
        public static void main(String[] args) {
            SearchEleLinkedList removeFirstNode=new SearchEleLinkedList();
            removeFirstNode.add(23);
            removeFirstNode.add(93);
            removeFirstNode.add(003);
            removeFirstNode.add(28);
            removeFirstNode.add(2068);
            removeFirstNode.printList();
            removeFirstNode.insertFirst(11);
            removeFirstNode.printList();
            removeFirstNode.insertFirst(12);
            removeFirstNode.printList();
            System.out.println(removeFirstNode.searchEle(11));

        }
    }

