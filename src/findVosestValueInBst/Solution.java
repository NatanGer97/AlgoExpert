package findVosestValueInBst;

class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
        this.value = value;
    }
}
public class Solution {
    public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        return findClosestValueInBst(tree,target,Integer.MAX_VALUE);
    }
    public static int findClosestValueInBst(BST tree, int target, int currentClosest) {
        // Write your code here.
        if (tree == null)
        {
            return currentClosest;
        }
        if (Math.abs(target) - Math.abs(tree.value) < Math.abs(target) - Math.abs(currentClosest))
        {
            currentClosest = tree.value;
        }
        if (tree.value <= target)
        {
            return findClosestValueInBst(tree.right,target,currentClosest);
        }
        else {
            return findClosestValueInBst(tree.left,target,currentClosest);
        }

    }


    private static BST find(BST node, int target) {
        BST nodeRes;
        if (node == null)
        {
            return node;
        }
        if (node.value <= target)
        {
            nodeRes = find(node.right,target);

        }

        else {
           nodeRes = find(node.left,target);
        }
        if (nodeRes == null) return  node;
        else return nodeRes;


    }
}
