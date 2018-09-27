package com.rohith.prac;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberCompare {

    public static void main (String[] args) {
        Number a[] = {21, 20.47, 20.5};

        BigDecimal x[] = new BigDecimal[a.length];
        for (int i=0; i<a.length; i++) {
            x[i] = new BigDecimal(a[i].toString());
            System.out.println(x[i]);
            }

        List p = Arrays.asList(x);
        Collections.sort(p);
        p.stream().forEach(l -> System.out.println(l));
    }
}
