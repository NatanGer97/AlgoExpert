package sortedSquaredArray;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquaredArray(new int[]{-3, -2, -1})));
    }

    public static int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int left = 0;
        int right = array.length - 1;
        int[] resultsArr = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--)
        {
            if (Math.abs(array[left]) < Math.abs(array[right])) { // left is the min
                resultsArr[i] = (int) Math.pow(Math.abs(array[right]), 2);
                right--;

            } else {
                resultsArr[i] = (int) Math.pow(Math.abs(array[left]), 2);
                left++;

            }
        }
        return resultsArr;
    }
}
