package com.rohith.prac;

import java.util.HashMap;
import java.util.Map;

public class ElectionWinner {
    public static void main(String[] args) {
        String[] votes = {"joe", "mary", "joe", "mary"};
        System.out.println(electionWinner(votes));
    }

    private static String electionWinner(String[] votes) {
        Map<String, Integer> voteMap = new HashMap<>();
        int maxNumberOfVotes = 0;
        String electionWinner = "";

        //load all the votes into a HashMap by Iterating over array to determine each candidates total votes
        for (String candidate : votes) {
            if (voteMap.keySet().contains(candidate))
                voteMap.put(candidate, voteMap.get(candidate) + 1);
            else
                voteMap.put(candidate, 1);
        }

        //Determine the maximum vote candidate
        for (Map.Entry<String, Integer> candidate : voteMap.entrySet()) {
            //Maximum votes are not shared between 2 or more candidates
            if (candidate.getValue() > maxNumberOfVotes) {
                maxNumberOfVotes = candidate.getValue();
                electionWinner = candidate.getKey();
            }
            // If maximum votes are shared between 2 candidates - candidate name falling Alphabetically later is returned
            else if (candidate.getValue() == maxNumberOfVotes &&
                    electionWinner.compareTo(candidate.getKey()) < 0)
                electionWinner = candidate.getKey();
        }
        return electionWinner;
    }
}