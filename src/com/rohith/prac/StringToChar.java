package com.rohith.prac;

public class StringToChar {

    public static void main(String[] args) {
        String x = "fsdgh";
        for (int i=0; i<x.toCharArray().length; i++) {
            System.out.println((int)x.charAt(i));
        }
    }
}