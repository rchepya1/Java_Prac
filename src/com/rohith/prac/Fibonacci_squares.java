package com.rohith.prac;
import java.math.*;
import java.util.Arrays;
import java.util.Random;

public class Fibonacci_squares {
    /**
     * Problem:
     * See <a href="https://www.hackerrank.com/challenges/fibonacci-modified/problem">HackerRank-fibonacci-modified/problem</a>
     */

    static BigInteger fibonacciModified(int t1, int t2, int n) {
        BigInteger[] fibonacciNumbers = new BigInteger[n];
        fibonacciNumbers[0] = BigInteger.valueOf(t1);
        fibonacciNumbers[1] = BigInteger.valueOf(t2);

        for (int i=2; i<=n-1; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i-2].add(fibonacciNumbers[i-1].pow(2));
        }
        //Arrays.stream(fibonacciNumbers).forEach(x -> System.out.print(x+ ","));
        return fibonacciNumbers[n-1];
    }

    public static void main(String[] args) {
        BigInteger result = fibonacciModified(2, 5, 5);
        System.out.print(result);

        System.out.println(Math.random());
    }
}
