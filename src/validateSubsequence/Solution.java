package validateSubsequence;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        System.out.println(isValidSubsequence(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10),
                Arrays.asList(1, 6, -1, 10)));

    }
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
         int indexInSequence = 0;
         int indexInArr = 0;
         while (indexInArr < array.size() && indexInSequence < sequence.size())
        {
            if (array.get(indexInArr).equals(sequence.get(indexInSequence)))
            {
                indexInSequence++;
            }

            indexInArr++;
        }
         return indexInSequence == sequence.size();

        /*for (int numInArr : array) {
            int numInSeq = sequence.get(indexInSequence);
            if (indexInSequence == sequence.size()) break;
            if (numInArr == numInSeq) {
                indexInSequence++;
            }
        }
        return indexInSequence == sequence.size();*/
    }
}
