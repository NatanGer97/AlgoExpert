package nodeDepths;

public class Solution
{
    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.left.left = new BinaryTree(4);
        root.left.left.left = new BinaryTree(8);
        root.left.left.right = new BinaryTree(9);
        root.left.right = new BinaryTree(5);
        root.right = new BinaryTree(3);
        root.right.left = new BinaryTree(6);
        root.right.right = new BinaryTree(7);
        System.out.println(nodeDepths(root));
    }
    public static int nodeDepths(BinaryTree root) {
        // Write your code here.
        return nodeDepths(root,0);

    }

        private static int nodeDepths(BinaryTree currentNode, int currentDepth) {
          if (currentNode == null) return 0 ;
          return currentDepth + nodeDepths(currentNode.left,currentDepth+1)
                  + nodeDepths(currentNode.right, currentDepth + 1);


        }

}
