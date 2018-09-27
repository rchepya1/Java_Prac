/**
 * Created by rohith on 2/15/18.
 */
public class LinkedListAsString {
    private static class Node {
        public Integer data;
        public Node next;


        public Node(Integer data) {
            this.data = data;
            this.next = null;
        }
    }


    public static Node head = null;


    public static void printNode(Node head) {
        Node currentNode = head;
        String path = new String();
        while (currentNode != null) {
            //System.out.print(currentNode.data);
            path += currentNode.data;
            currentNode = currentNode.next;
            if (currentNode != null) {
                // To print the "->" symbol till the last element only
                path += "-->";
            }
        }
        System.out.println(path);
    }


    public static void main(String[] args) {
        Integer[] a = {1,4,2,3,7};
        //Assigning the original arguments as a linked list in the same order given
        for (int i = a.length - 1; i >= 0; i--) {
            Node n = new Node(a[i]);
            n.next = head;
            head = n;
        }

        printNode(head);

    }

}
