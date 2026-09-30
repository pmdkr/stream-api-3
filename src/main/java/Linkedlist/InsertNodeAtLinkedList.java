package Linkedlist;

public class InsertNodeAtLinkedList {

    public static void main(String[] args) {

        //create a linkedList from the array

        int[] arr = {1, 2, 3, 4, 5, 6};

        Node head = new Node(arr[0]);
        Node curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }


        // print the linked List
        Node curr1 = head;
        System.out.println("all element of the linkedList: ");
        while (curr1 != null) {

            System.out.println("-> " + curr1.data);
            curr1 = curr1.next;
        }

        // insert the node at first position
        Node startNode = insertAtBeginning(head, 0);
        Node curr2 = startNode;
        System.out.println("Elements after the added in starting: ");
        while (curr2 != null) {
            System.out.println(" ->" + curr2.data);
            curr2 = curr2.next;
        }

        //insert the node at any position

        Node resultNode = insertAtAnyPosition(head, 3, 7);
        System.out.println("print the element after inserting at above given position: ");
        Node curr3 = resultNode;
        while (curr3 != null) {
            System.out.println("-> " + curr3.data);
            curr3 = curr3.next;
        }

        // insert the node at last position

        Node newNodeEnd = insertAtLast(head, 8);
        System.out.println("print the element after inserting at end: ");
        Node curr4 = newNodeEnd;
        while (curr4 != null) {
            System.out.println("-> " + curr4.data);
            curr4 = curr4.next;
        }

    }


    public static Node insertAtBeginning(Node head, int item) {
        Node newNode = new Node(item);
        newNode.next = head;
        return newNode;
    }

    public static Node insertAtAnyPosition(Node head, int position, int item) {
        int count = 0;
        Node newNode = new Node(item);

        // 0 -> 1 ->2 ->3 -> 4 -> 5 -> -> 6
        Node curr = head;
        for (int i = 0; i < position; i++) {

            count++;

            if (count == position && curr.next != null) {
                Node next = curr.next;
                curr.next = newNode;
                curr.next.next = next;
            } else if (curr.next != null) {
                curr = curr.next;
            }
        }
        return head;


    }

    public static Node insertAtLast(Node head, int item) {


        Node newNode = new Node(item);

        //if the list empty
        if (head == null) {
            return newNode;
        }


        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        // curr is now the last node
        curr.next = newNode;
        return head;
    }
}



