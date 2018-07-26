package com.rohith.prac;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;


public class Rounding {

    public static void main(String args[]) {/*

            *//*String inp = "XYZ";
            String out = "";
            for (int i=inp.length()-1; i>=0; i--) {
                out += inp.charAt(i);
            }
        System.out.println(out);

        double start = 2200;
        double end = 2300;
        BigDecimal vatRate = new BigDecimal(0.08);
        System.out.println("start: " + start + "\n" + "end: " + end);
        while (start < end) {
            BigDecimal nicePrice = BigDecimal.valueOf(start); //From FSI
            BigDecimal taxExclusiveAmount = nicePrice.divide(vatRate.add(BigDecimal.ONE), 2, BigDecimal.ROUND_HALF_DOWN);
            BigDecimal originalPrice = taxExclusiveAmount;
            BigDecimal fsiDiscountAmountInBroker = originalPrice.multiply(vatRate.add(BigDecimal.ONE)).setScale(2, BigDecimal.ROUND_HALF_DOWN);
            if (nicePrice.compareTo(fsiDiscountAmountInBroker) != 0) {
                System.out.println("nicePrice: " + nicePrice + "\n" + "fsiDiscountAmountInBroker: " + fsiDiscountAmountInBroker);
            }
            start++;
        }
        *//*
            *//*int decimal = 1;
            int x = 0;
            int i;
            String sdfg = "1239568";
            for (i= sdfg.length()-1;i>=0; i--) {
                x += (sdfg.charAt(i)-'0')*decimal;
                decimal *= 10;
            }
            System.out.println(x);*//*


        *//*int[] arr = {2,6,1,7,3,8,3};
        int n = arr.length;
        for (int i=1; i<n; i++)
        {
            int key = arr[i];
            int j = i-1;

            *//**//* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position *//**//*
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
*//*


        *//*int[] a = {2,6,1,7,3,8,3};

        for (int i=1; i<a.length; i++) {
            int number = a[i];
            int j = i-1;

            while (j>0 && a[j]>number) {
                a[j+1]=a[j];
                j--;
            }
            a[j+1] = number;
        }*//*




        *//*for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]);
        }
*//*


                System.out.println("Hello, world!");


                List<Subscription> subscriptions = new ArrayList<Subscription>();
        subscriptions.add(new Subscription(new Date(20180501), new Date(20180531),true));
        subscriptions.add(new Subscription(new Date(20180502), new Date(20180530),true));
        subscriptions.add(new Subscription(new Date(20180503), new Date(20180529),false));

                List<Subscription> subscriptions1 = subscriptions.stream().filter(subscription->subscription.isCurrent).collect(Collectors.toList());
        subscriptions1.forEach(s -> {System.out.println(s);});



               // List<String> subscriptions2 = subscriptions.stream().sorted(Comparator.comparing(String s) ->!s.isCurrent).thenComparing(Subscription::nextPayment);


            }
        */
    }
}

         class Subscription {

            Date lastPayment;
            Date nextPayment;
            Boolean isCurrent;


            public Subscription(Date date, Date date1, boolean b) {

            }
        }
