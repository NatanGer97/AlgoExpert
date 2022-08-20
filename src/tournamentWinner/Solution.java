package tournamentWinner;

import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {

    }
    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results)
    {
        // Write your code here.
        Map<String,Integer> resultsMap = new HashMap<>();

  /*      for (int i = 0; i < competitions.size(); i++) {
            String homeTeam = competitions.get(i).get(0);
            String awayTeam = competitions.get(i).get(1);
            resultsMap.put(homeTeam,0);
            resultsMap.put(awayTeam,0);
        }*/
        for (int i = 0; i < competitions.size(); i++)
        {
            Integer winningTeamIndex = results.get(i);
            String winningTeam = competitions.get(i).get(winningTeamIndex);
            if (resultsMap.containsKey(winningTeam))
            {
                resultsMap.put(winningTeam,resultsMap.get(winningTeam) + 3);
            }
            else
            {
                resultsMap.put(winningTeam, 3);

            }
        }
/*
        for (int i = 0; i < competitions.size(); i++) {
            String homeTeam = competitions.get(i).get(0);
            String awayTeam = competitions.get(i).get(1);
            if (results.get(i) == 0) // away team Win
            {
                Integer oldResults = resultsMap.get(awayTeam);
                resultsMap.put(awayTeam, oldResults+3);
            }
            else {
                Integer oldResults = resultsMap.get(homeTeam);
                resultsMap.put(homeTeam, oldResults+3);
            }
        }*/


        return Collections.max(resultsMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
