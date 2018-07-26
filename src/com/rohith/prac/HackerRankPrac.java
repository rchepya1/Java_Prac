package com.rohith.prac;


import java.util.Stack;


/**
 * Created by rohith on 5/27/18.
 */
public class HackerRankPrac {

    public static void main (String[] args) {
        System.out.println();
        //private static String encode(String text) {
        String text = "Coffee";
            StringBuilder b = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                b.append(Integer.valueOf(c));
            }

       // String c = b.reverse().toString();
        System.out.println(b);
        /*StringBuilder d = new StringBuilder(c);
        StringBuilder out = new StringBuilder();

        //return b.reverse().toString();
        String e = d.reverse().toString();
        char[] x = e.toCharArray();
        String[] z = new String[5];
        for (int h = 0; h<x.length; h++) {
            z[h] = String.valueOf(x[h]);
        }
        String[] k = new String[5];
        for (int h = 0; h<x.length; h++) {
            k[h] = String.valueOf(z[h]);
            //out.append(Character.toString(String.valueOf(Integer.parseInt(String.valueOf(k[h]))-(Integer.parseInt(String.valueOf(k[0]))/2) - h - '0')));
            System.out.println(out);
        }
*/
        }



}
