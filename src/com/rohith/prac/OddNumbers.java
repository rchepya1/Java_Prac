package com.rohith.prac;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Created by rohith on 5/27/18.
 */
public class OddNumbers {


    public static void main(String[] args) {
        /*
         * Write your code here.
         */

        int l = 2;
        int r=19;
        int length = (r-l)/2;
        int[] output = new int[length];
        int i=0;
        for (l = 1 + l; l<r; l++) {
            if (l%2 != 0) {
                output[i] = l;
                i++;
            }
        }
        for (int j:output) {
            System.out.println(j);
        }

    }
}
