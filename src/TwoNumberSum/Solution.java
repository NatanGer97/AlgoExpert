package TwoNumberSum;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[] {3,5,-4,8,11,1,-1,6};
        System.out.println(Arrays.toString(twoNumberSumHashing(arr, 10)));
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int currentNum = array[i];
            int searchingNumber  = targetSum - currentNum;
            int searchResultIndex = Arrays.binarySearch(array, searchingNumber);
            if (searchResultIndex > 0 && currentNum != searchingNumber) {
                return   new int[]{currentNum, searchingNumber};
            }

        }

        return new int[0];
    }
    public static int[] twoNumberSumHashing(int[] array, int targetSum) {
        // Write your code here.
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : array) {
            hashSet.add(num);
        }
        for (int num : array) {
            int searchingNum = targetSum - num;
            if (hashSet.contains(searchingNum) && searchingNum != num)
            {
                return new int[]{searchingNum,num};
            }
        }

        return new int[0];
    }
}