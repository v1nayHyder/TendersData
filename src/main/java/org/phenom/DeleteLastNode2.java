package org.phenom;

public class DeleteLastNode2 {
        LisNode head;
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

            }
            else {
                LisNode currentNode=head;
                while (currentNode.next!=null){
                    currentNode=currentNode.next;
                }
                currentNode.next=newNode;

            }

        }
        void printList(){
            if (head==null){
                System.out.println("List is Empty");
            }
            else{
                LisNode currentNode=head;
                while (currentNode!=null){
                    System.out.print(currentNode.val+"--->");
                    currentNode=currentNode.next;
                }
                System.out.println("NULL");
            }
        }
        void deleteLastNode(){
            if (head.next == null) {

                head=null;
                return;
            }
            LisNode currentNode=head;
            while (currentNode.next!=null) {
                if(currentNode.next.next==null){
                    currentNode.next=null;

                }
                else {
                    currentNode=currentNode.next;
                }
            }
        }

        public static void main(String[] args) {
            DeleteLastNode2 deleteLastNode2=new DeleteLastNode2();
            deleteLastNode2.insert(12);
//            deleteLastNode2.insert(142);
//            deleteLastNode2.insert(125);
//            deleteLastNode2.insert(128);
//            deleteLastNode2.insert(122);
            deleteLastNode2.printList();
            deleteLastNode2.deleteLastNode();
            deleteLastNode2.printList();


        }
    }


