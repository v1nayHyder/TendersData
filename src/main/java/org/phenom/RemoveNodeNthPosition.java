package org.phenom;

public class RemoveNodeNthPosition {
    ListNode head;
    static  class ListNode{
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }
    void addNode(int data){
        ListNode newNode=new ListNode(data);
        if (head==null){
            head=newNode;
            return;
        }
        ListNode current=head;
        while (current.next!=null){
            current=current.next;
        }
        current.next=newNode;

    }
    void printList(){
        if (head==null) {
            System.out.println("List is empty");
            return;
        }
        ListNode current=head;
        while (current!=null){
            System.out.print(current.data+"--->");
            current=current.next;

        }
        System.out.println("NULL");
    }
    void removeLast(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        else if (head.next==null) {
            head=null;
            System.out.print("List had only one node that are deleted now ");
            return;
        }
        ListNode currentNode=head;
        ListNode next=currentNode.next.next;
        while (next!=null&& currentNode.next!=null){
              currentNode=currentNode.next;
              next=currentNode.next.next;
        }
        currentNode.next=null;

    }

    public static void main(String[] args) {

        RemoveNodeNthPosition removeNodeNthPosition=new RemoveNodeNthPosition();
        removeNodeNthPosition.addNode(23);
        removeNodeNthPosition.addNode(33);
        removeNodeNthPosition.addNode(43);
        removeNodeNthPosition.addNode(53);
        removeNodeNthPosition.addNode(63);
        removeNodeNthPosition.addNode(73);
        removeNodeNthPosition.printList();
        removeNodeNthPosition.removeLast();
        removeNodeNthPosition.printList();
    }
}
