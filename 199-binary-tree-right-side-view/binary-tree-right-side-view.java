/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static List<Integer> rightSideViewUtil(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if (root == null)
        return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int listSize = queue.size();
            for (int i = 0 ; i< listSize ;i ++){
                TreeNode currNode = queue.poll();
                if (i == listSize - 1)
                    result.add(currNode.val);
                if (currNode.left != null)
                    queue.add(currNode.left);
                if (currNode.right != null)
                    queue.add(currNode.right);
            }

        }
        return result;
    }
    public List<Integer> rightSideView(TreeNode root) {
       return rightSideViewUtil(root);

    }
}