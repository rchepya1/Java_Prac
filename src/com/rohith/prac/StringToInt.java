package com.rohith.prac;


/**
 * Created by rohith on 5/23/18.
 */
public class StringToInt {
    public static void main(String[] args) {
        String str = "-91283472332";
        if (str.equals("") || str == null)
            System.exit(0);
        int output = 0;
        int strLen = str.length();
        int negateBy = 1;//Indicates not negative
        int j =0;
        while (j < strLen) {
            if (str.substring(0,1).equals(" ")) {
                str = str.substring(1);
                j++;
            } else
                break;
        }
        if (str == null || str.equals("")) {
            System.out.println(0);
            System.exit(0);
        }
        if (str.charAt(0) == '-') {
            negateBy = -1;
            str = str.substring(1);
        } else if (str.charAt(0) == '+') {
            str = str.substring(1);
        }
        if (str.equals("") || str == null) {
            System.out.println(0);
            System.exit(0);
        }
        strLen = str.length();
        if (!str.substring(0, 1).matches("\\d")) {//To return 0 if there are words preceeding the number
                System.out.println(0);
                System.exit(0);
            }

        for (int i=0; i<strLen; i++) {
            if (i >= 0 && str.substring(i, i + 1).matches("\\D")) {//To ignore the words succeeding the number
                break;
            } else {
                int nextValue = (str.charAt(i) - '0'); //charAt gives ASCII value(48 for 0, 49 for 1, etc..). So subtracting it.
                if (output >= (Integer.MAX_VALUE - nextValue)/10 && ((output*10) + nextValue > Integer.MAX_VALUE)) { //Maximum integer value check
                    System.out.println((negateBy == -1) ? Integer.MIN_VALUE : Integer.MAX_VALUE);
                    System.exit(0);
                } else {
                    output = (output*10) + nextValue;
                }
            }
        }
        System.out.println(output * negateBy);
    }
}
