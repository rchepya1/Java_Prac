package com.rohith.prac;

public class CountAndSay {
    public static void main (String[] args) {
        System.out.println(countAndSay(50));
    }
    public static String countAndSay(int n) {
        String[] array = new String[n];
        return recursive(array);
    }

    public static String recursive(String[] array) {
        array[0] = "1";
        String previous = array[0];
        for (int index =1;index <array.length; index++) {
            StringBuilder output = new StringBuilder();
            int[] digits = previous.chars().map(y -> y - '0').toArray();
            for (int i = 0; i < digits.length; i++) {
                int count = 1;
                while (i < digits.length - 1 && digits[i] == digits[i + 1]) {
                    count++;
                    i++;
                }
                output.append(count).append(digits[i]);
            }
            array[index] = output.toString();
            previous = output.toString();
        }
        return previous;
    }
}
