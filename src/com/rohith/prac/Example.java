package com.rohith.prac;


/**
 * Created by rohith on 4/10/18.
 */
class Example {
    Node head = null;


    static class Node {
        int data;
        Node next;


        Node(int d) {
            data = d;
            next = null;
        }
    }


    public void pushAtEnd(int value) {
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = new Node(value);
        //System.out.println(n);
        //System.out.println(head);
    }


    public void pushAtFirst(int value) {
        head.next = head;
        head = new Node(value);
    }


    public static void main(String[] args) {

        Example list = new Example();
        list.head = new Node(5);
        list.head.next = new Node(8);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(2);
        list.head.next.next.next.next = new Node(9);
        list.head.next.next.next.next.next = new Node(3);
        list.head.next.next.next.next.next.next = new Node(0);
        list.pushAtEnd(3);
        list.pushAtEnd(0);
        list.head.next.next.next.next.next.next.next = list.head.next.next.next;
        //list.printList(list.head);
        /*if (list.checkForLoop(list.head)) {
            list.breakLoop(list.head);
        }*/
        list.checkForLoop(list.head);
        //5->8->4->2->9->3->0->2->9->3->0->2->9->3->0->2->9->3->0->2->9->3->0
        list.printList(list.head);
            list.swapPairs(list.head);
        list.printList(list.head);
    }


    void printList(Node x) {
        while (x != null) {
            System.out.print(x.data + "->");
            x = x.next;
        }
    }


    void checkForLoop(Node n) {
        Node first = n;
        Node second = n;

        while (first != null && second != null && second.next != null) {
            first = first.next;
            second = second.next.next;

            if (first == second) {
                System.out.println("Has a Loop");
                break;
            }
        }
        second = n;
        int loopSize = 0;
        while (second != null && second.next != null) {
            second = second.next;
            loopSize++;
            if (first == second) {
                break;
            }
        }
        System.out.println("loop at: "+ loopSize);

        first = second = n;

        for (int i=0; i<loopSize; i++) {
            first = first.next;
        }

        while (first != null && second != null && second.next != null) {
            if (first.next == second.next) {
                first.next = null;
                break;
            }
            first = first.next;
            second = second.next;
            System.out.println(first.data);
        }
    }

    public void swapPairs(Node head) {
        Node temp = head;
        while (temp.next != null && temp.next.next != null) {
            //5->8->5->4->2->9->3->0->2->9->3->0->2->9->3->0->2->9->3->0->2->9->3->0
                head = head.next;
                head.next = temp;
                head.next.next = temp.next.next;
            //System.out.println(head.data + " " + head.next.data + " " + head.next.next.data);
            }
        }

}
