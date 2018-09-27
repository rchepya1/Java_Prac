import java.util.ArrayList;


/**
 * Created by rohith on 8/20/17.
 */
public class ReverseLinkedList {
    private static class Node {
        public String data;
        public Node next = new Node(data);

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }


    public static Node head = null;


    public Node reverseList(Node current) {
        if (current == null) {
            System.out.println("The list was null");
            return null;
        }
        if (current.next == null) {
            head = current;
            return null;
        }
        reverseList(current.next);
        current.next.next = current;
        current.next = null;
        return head;
    }


    public static void printNode(Node head) {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data);
            currentNode = currentNode.next;
            if (currentNode != null) {
                // To print the "->" symbol till the last element only
                System.out.print("->");
            }
        }
    }


    public static void main(String args[]) {
        //Assigning the original arguments as a linked list in the same order given
        for (int i = args.length - 1; i >= 0; i--) {
            Node n = new Node(args[i]);
            n.next = head;
            head = n;
        }
        System.out.println("Given LinkedList :");
        printNode(head);
        // Reversing the linked list
        Node reverse = new ReverseLinkedList().reverseList(head);
        if (head != null && head.next != null) {
            System.out.println("\n" + "Reversed LinkedList :");
        }
        if (head != null && head.next == null) {
            System.out.println("\n" + "the list has only one Node with value " + head.data);
        }
        printNode(reverse);
    }

}
