package com.rohith.prac;

/*
 **  Instructions:
 **
 **  Given a list of student test scores, find the best average grade.
 **  Each student may have more than one test score in the list.
 **
 **  Complete the bestAverageGrade function in the editor below.
 **  It has one parameter, scores, which is an array of student test scores.
 **  Each element in the array is a two-element array of the form [student name, test score]
 **  e.g. [ "Bobby", "87" ].
 **  Test scores may be positive or negative integers.
 **
 **  If you end up with an average grade that is not an integer, you should
 **  use a floor function to return the largest integer less than or equal to the average.
 **  Return 0 for an empty input.
 **
 **  Example:
 **
 **  Input:
 **  [ [ "Bobby", "87" ],
 **    [ "Charles", "100" ],
 **    [ "Eric", "64" ],
 **    [ "Charles", "22" ] ].
 **
 **  Expected output: 87
 **  Explanation: The average scores are 87, 61, and 64 for Bobby, Charles, and Eric,
 **  respectively. 87 is the highest.
 */

import java.util.*;

class Scores {
    List<Integer> listOfScores = new ArrayList<>();
    String name;
}


class ScoresAverage {
    /*
     **  Find the best average grade.
     */
    public static Integer bestAverageGrade(String[][] scores) {
        // TODO: implement this function
        Map<String, Scores> outputMap = new HashMap<>();

        for (int i = 0; i < scores.length; i++) {
            if (outputMap.keySet().contains(scores[i][0])) {
                outputMap.get(scores[i][0]).listOfScores.add(Integer.parseInt(scores[i][1]));
            } else {
                Scores scores1 = new Scores();
                scores1.listOfScores.add(Integer.parseInt(scores[i][1]));
                scores1.name = scores[i][0];
                outputMap.put(scores[i][0], scores1);
            }
        }

        outputMap.forEach((k, v) -> System.out.println(k + ": " + v.listOfScores));
        return (int) Collections.max(outputMap.entrySet(), (o1, o2) -> o1.getValue().listOfScores.stream().mapToDouble(x -> x).average().toString().
                compareTo(o2.getValue().listOfScores.stream().mapToDouble(x -> x).average().toString())).
                getValue().listOfScores.stream().mapToInt(x -> x).average().getAsDouble();

        //List<Integer> avgVal = outputMap.entrySet().stream().forEach((k) -> k.getValue().listOfScores.stream().mapToInt(x-> x).average().getAsDouble());

        /*outputMap.forEach((k, v) -> {
            v.listOfScores.stream().mapToInt(x-> x).average().getAsDouble();
        });*/
    }

    /*
     **  Returns true if the tests pass. Otherwise, returns false;
     */
    private static boolean doTestsPass() {
        // TODO: implement more test cases
        String[][] tc1 = {{"Bobby", "87"},
                {"Charles", "100"},
                {"Eric", "64"},
                {"Charles", "22"}};
        return bestAverageGrade(tc1) == 87;
    }

    /*
     **  Execution entry point.
     */
    public static void main(String[] args) {
        // Run the tests
        if (doTestsPass()) {
            System.out.println("All tests pass");
        } else {
            System.out.println("Tests fail.");
        }
    }
}