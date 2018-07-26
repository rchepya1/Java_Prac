package com.rohith.prac;

public class StringDigit {

    public static void main (String [] a) {
        String s="-12345690a";

        // Get MAX int value in i
        int i = -1;
        while (i<0) {
            i--;
        }
        System.out.println("value::"+i);

        char ch[] = s.toCharArray();
        int result = 0;
        int temp=0;
        //get ascii value for zero
        int zeroAscii = (int)'0';
        for(char c:ch){
            int tmpAscii = (int)c;
            result=temp;
            System.out.println("in loop tmpAscii is::"+tmpAscii);
            if (result <0 || tmpAscii <47 || tmpAscii>58 ) {
                break;
            } else {
                temp = (result*10)+(tmpAscii-zeroAscii);
            }
            System.out.println("in loop is::"+temp);

        }

        System.out.println("result is::"+result);
    }
}
