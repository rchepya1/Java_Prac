package com.rohith.prac;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


/**
 * Created by rohith on 4/26/18.
 */
public class PalindromeGame {

   /*
         * Complete the playWithWords function below.
         */
        static int playWithWords(String s) {

            String firstSeq = null;
            String secondSeq = null;

            int Ai = 0;
            int Aj = 0;
            int Bi = s.length()-1;
            int Bj = s.length()-1;

            for (Ai = 0; Aj<s.length()-1; Aj++) {
                String temp = s.substring(Ai,Aj);
                if (temp.equals(reversal(temp))) {
                    firstSeq = temp;
                }
                System.out.println(firstSeq);
            }


        /*
         * Write your code here.
         */

        return 0;
        }

        static String reversal(String inp) {
            String out = "";
            for (int i=inp.length()-1; i>=0; i--) {
                out += inp.charAt(i);
            }
            return out;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String s = "eeegeeksforskeeggeeks";

            int result = playWithWords(s);

            System.out.println(result);

            /*bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedWriter.close();*/
        }
    }
