package Linkedlist;

public class SearchInList {

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);


        //print linked list
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data +" -> ");
            curr = curr.next;

        }

        //find the position of linked list
        int position=findNode(head,4);
        System.out.println("element found at "+position+ " position");
    }


    public static int findNode(Node head, int item) {
        Node curr = head;
        int count = 1;
        while (curr != null) {
            if (curr.data == item) {
                return count;
            }
            curr = curr.next;
            count++;
        }

        return -1;
    }


}

