package com.rohith.prac;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamsPerformance {

    public static void main(String[] args) {
        int min = 1;
        int max = 1000000;

        List<Integer> sourceList = new ArrayList<>();
        for (int i = min; i < max; i++) {
            sourceList.add(i);
        }

        long t0 = System.nanoTime();
        long elapsed = 0;
        Stream<Integer> stream;
        for (int j=0; j<10; j++) {
            stream = sourceList.stream();
            t0 = System.nanoTime();
            stream.filter(i -> i % 2 == 0).map(i -> Math.sqrt(i)).collect(Collectors.toList());
            elapsed = System.nanoTime() - t0;
        }
        System.out.printf("Streams: Elapsed time:\t\t %d ns \t(%f seconds)%n", elapsed, elapsed / Math.pow(10, 9));

        List<Double> result1 = new ArrayList<>();
        t0=System.nanoTime();
        for (Integer i : sourceList) {
            if (i % 2 == 0) {
                result1.add(Math.sqrt(i));
            }
        }
        elapsed = System.nanoTime() - t0;
        System.out.printf("Collections: Elapsed time:\t %d ns \t(%f seconds)%n", elapsed, elapsed / Math.pow(10, 9));

        stream = sourceList.stream().parallel();
        t0 = System.nanoTime();
        stream.filter(i -> i % 2 == 0).map(Math::sqrt).collect(Collectors.toList());
        elapsed = System.nanoTime() - t0;
        System.out.printf("Parallel streams: Elapsed time:\t %d ns \t(%f seconds)%n", elapsed, elapsed / Math.pow(10, 9));

    }
}
