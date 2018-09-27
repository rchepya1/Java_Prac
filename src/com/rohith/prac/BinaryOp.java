package com.rohith.prac;

public class BinaryOp {

    public static int sumBinary(String a, String b) {
        StringBuilder s = new StringBuilder();
        int carry = 0;
        int length1 = a.length() - 1;
        int length2 = b.length() - 1;

        while (length1 >= 0 || length2 >= 0) {

            int sum = carry;

            if (length1 >= 0) {

                sum += a.charAt(length1) - '0';
                length1--;
            }

            if (length2 >= 0) {

                sum += b.charAt(length2) - '0';
                length2--;
            }

            carry = sum >> 1;
            s.append((sum & 1) == 0 ? '0' : '1');
        }

        if (carry > 0) {
            s.append('1');
        }

        s.reverse();
        return Integer.parseInt(s.toString());
    }

    public static void main(String[] args) {
        System.out.println(sumBinary("10110111", "1011"));
    }
}
