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
    void inorder(TreeNode root, List<TreeNode> sortedArray){
        if (root != null){
            inorder(root.left,sortedArray);
            sortedArray.add(root);
            inorder(root.right,sortedArray);
        }
    }
    public TreeNode balanceBST(TreeNode root) {
        // first take the inorder traversal
        // using the sorted array make BST
        List<TreeNode> sortedArray = new ArrayList<>();
        inorder(root,sortedArray);
        for (int i =0 ; i < sortedArray.size() ;i ++){
            System.out.println(sortedArray.get(i).val);
        }
        return sortedArrayToTree(0,sortedArray.size()-1,sortedArray);
    }

    public TreeNode sortedArrayToTree(int start , int end , List<TreeNode>sortedArray ){
        if (start > end) return null;
        int mid = (start + end)/2 ;
        TreeNode root = new TreeNode(sortedArray.get(mid).val);
        root.left = sortedArrayToTree(start,mid - 1, sortedArray);
        root.right = sortedArrayToTree(mid + 1,end,sortedArray);
        return root;
    }
}