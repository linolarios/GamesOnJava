package linkedList;

/**
 * Created by STO on 21/02/2016.
 */
public class LinkedList {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }


    // Function that detects loop in the list
    void detectAndRemoveLoop(Node node) {
        Node slow = node;
        Node fast = node.next;

        // Search for loop using slow and fast pointers
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        /* If loop exists */
        if (slow == fast) {
            slow = node;
            while (slow != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }

            /* since fast->next is the looping point */
          //  fast.next = null; /* remove loop */
            System.out.println("The loop is in: "+ fast.next.data);

        }
    }

    // Function to print the linked list
    void printList(Node node) {
        int count =0;
        while (count != 5) {
            System.out.print(node.data + " ");
            node = node.next;
            count++;
        }
    }


    // Driver program to test above functions
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);


      //  Node find = nthFromLastNode(list.head,3);
        Node reverse =  reverseLinkedList(list.head);
        //System.out.println("nth node : " + find.data);
        // Creating a loop for testing
       // head.next.next.next.next.next = head.next.next;
        //list.detectAndRemoveLoop(head);
        System.out.println("Linked List after removing loop : ");
        list.printList(reverse);
    }


    public static Node nthFromLastNode(Node head,int n)
    {
        Node firstPtr=head;
        Node secondPtr=head;

        for (int i = 0; i < n; i++) {
            firstPtr=firstPtr.next;

        }
        System.out.println(firstPtr.data);
        while(firstPtr!=null)
        {
            firstPtr=firstPtr.next;

            secondPtr=secondPtr.next;

        }

        return secondPtr;
    }

    public static Node reverseLinkedList(Node currentNode)
    {
    // For first node, previousNode will be null
        Node previousNode=null;
        Node nextNode;
        while(currentNode!=null)
        {
            nextNode=currentNode.next;
            // reversing the link
            currentNode.next=previousNode;
            // moving currentNode and previousNode by 1 node
            previousNode=currentNode;
            currentNode=nextNode;
        }
        return previousNode;
    }



}
