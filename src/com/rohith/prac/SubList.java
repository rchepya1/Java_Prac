package com.rohith.prac;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SubList {

    public static void main (String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a123X", "b123X", "c123X"));
        List<String> subList = list.subList(0, 2);
        list.clear();
        list.forEach(System.out::println);
        String x = subList.get(0);
        x=x.substring(1,4);
        subList.size();
       // System.out.println("End of operation. Printing subString:"+ x);
    }
}
