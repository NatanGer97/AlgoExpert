package minimumWaitingTime;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(minimumWaitingTime(new int[]{3,2,1,2,6}));
    }
    public static int minimumWaitingTime(int[] queries) {
        // Write your code here.
        int waitingTime = 0;
        Arrays.sort(queries);
        List<Integer> times = new LinkedList<>();
    /*    for (int i = 1; i < queries.length; i++) {
            waitingTime = waitingTime + queries[i-1];
            times.add(waitingTime);

        }
        Optional<Integer> reduce = times.stream().reduce((integer, integer2) -> integer + integer2);
        return reduce.orElse(-1);*/

        for (int i = 0; i < queries.length; i++) {
            int queriesLeft  = queries.length - (i + 1);
            waitingTime += queries[i] * queriesLeft;
        }
        return waitingTime;
    }
}
