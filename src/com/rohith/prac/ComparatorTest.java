package com.rohith.prac;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;


/**
 * Created by rohith
 */

/**
 * Sorts all Locales by using Java 8 Comparator comparing
 */
public class ComparatorTest {

        public static void main(String[] args) {
            Locale[] locales = Locale.getAvailableLocales();
            System.out.println("Unsorted" +
                    ":");
            displayLocales(locales);

            Arrays.sort(locales, Comparator.comparing(Locale::toString));
            //Or can be sorted by the following line
            //Arrays.sort(locales, ((o1, o2) -> {return o1.toString().compareTo(o2.toString());}));
            System.out.println("\nSorted:");
            displayLocales(locales);
        }

        public static void displayLocales(Locale[] locales) {
            Arrays.stream(locales).forEach(locale -> {
                System.out.print(locale.toString());
                if (locale != locales[locales.length - 1]) {
                    System.out.print(", ");
                }
            });
        }
    }
