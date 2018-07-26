package com.rohith.prac;


/**
 * Created by rohith on 5/22/18.
 */
public class MergeArrays {

    public static void main (String[] args) {
        int[] a = new int[]{2,5,6,7,8,18};
        int[] b = new int[]{1,5,8,9,15};
        int[] c = new int[a.length+b.length];
        int indexC = 0;

        int j=0;
        for (int ai:a) {
            while (j < b.length && b[j]<=ai) {
                c[indexC++] = b[j];
                j++;
            }
            c[indexC++] = ai;
        }
        while (b.length > j) {
            c[indexC++] = b[j];
            j++;
        }
        for (int x=0; x<c.length; x++) {
            System.out.print(c[x]);
        }
    }
}
