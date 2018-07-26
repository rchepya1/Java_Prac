package com.rohith.prac;

public class Fibanocci {

    public static void main(String[] args) {
        System.out.println(fib(9));
    }

    private static int fibn (int n) {
        if (n<=1) {
            return n;
        }
        return fibn(n-1) + fibn(n-2);
    }

    static int fib (int n) {
        int[] f = new int[n+2];
        f[0] =0;
        f[1] = 1;

        for (int i=2; i<=n; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }


}
