package com.rohith.prac;


import java.util.LinkedList;


/**
 * Created by rohith on 6/5/18.
 */
public class LinkedListSwap {

    public static void main(String args[]) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(6);
        linkedList.add(0);
        linkedList.add(9);
        linkedList.add(3);
        linkedList.add(7);
        linkedList.forEach(element -> System.out.print(element + "->"));

        for (int i=0; i+1<linkedList.size(); i++) {
            if (i+1<linkedList.size()) {
                Integer tmp = linkedList.get(++i);
                linkedList.remove(i);
                linkedList.add(i, linkedList.get(i - 1));
                linkedList.remove(i - 1);
                linkedList.add(i - 1, tmp);
            }
        }
        System.out.println();
        linkedList.forEach(element -> System.out.print(element + "->"));
    }
}
