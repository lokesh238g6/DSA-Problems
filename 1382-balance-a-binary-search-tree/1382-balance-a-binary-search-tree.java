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
    public TreeNode balanceBST(TreeNode root) {
        if (root == null) return null;
        List<Integer> l = new ArrayList<>();
        inorder(root, l);
        return balanced(l,0,l.size()-1);
    }
    public void inorder(TreeNode root, List<Integer> l) {
        if (root == null) return;
        inorder(root.left,l);
        l.add(root.val);
        inorder(root.right,l);
    }
    public TreeNode balanced(List<Integer>l,int start,int end) {
        if (start>end) return null;
        int mid=(start+end)/2;
        TreeNode node=new TreeNode(l.get(mid));
        node.left=balanced(l,start,mid-1);
        node.right = balanced(l,mid + 1,end);
        return node;
    }
}