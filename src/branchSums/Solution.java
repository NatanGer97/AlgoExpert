package branchSums;

import java.util.*;

public class Solution
{
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        ArrayList<Integer> sums = new ArrayList<>();
        branchSums(root,0,sums);
        return sums;
    }

    private static void branchSums(BinaryTree root, int sum, ArrayList<Integer> listOfSums)
    {
        if (root == null) return;
        sum += root.value;

        if (root.left == null && root.right == null)
        {
            listOfSums.add(sum);
            return;
        }
        branchSums(root.left,sum,listOfSums);
        branchSums(root.right,sum,listOfSums);
    }
}
