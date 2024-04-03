package org.phenom;

public class DeleteLastNode {
    LisNode head;
    LisNode tail;

    class LisNode {
        int val;

       LisNode next;

        public LisNode(int val) {
            this.val = val;
        }
    }
    void insert(int data){
        LisNode newNode=new LisNode(data);
        if (head==null){
            head=newNode;
            tail=newNode;
        }
        else {
            tail.next=newNode;
            tail=newNode;
        }

    }
    void printList(){
        if (head==null){
            System.out.println("List is Empty");
        }
        else{
            LisNode currentNode=head;
           while (currentNode!=tail.next){
               System.out.print(currentNode.val+"--->");
               currentNode=currentNode.next;
            }
            System.out.println("NULL");
        }
    }
    void deleteLastNode() {
        if (head.next == null) {
            return;
        }
            LisNode currentNode = head;
            while (currentNode != tail) {
                if (currentNode.next.next == null) {
                    tail = currentNode;

                } else {
                    currentNode = currentNode.next;
                }
            }


    }

    public static void main(String[] args) {
    DeleteLastNode deleteLastNode=new DeleteLastNode();
    deleteLastNode.insert(12);
//    deleteLastNode.insert(142);
//    deleteLastNode.insert(125);
//    deleteLastNode.insert(128);
//    deleteLastNode.insert(122);
    deleteLastNode.printList();
    deleteLastNode.deleteLastNode();
    deleteLastNode.printList();

    }
}
