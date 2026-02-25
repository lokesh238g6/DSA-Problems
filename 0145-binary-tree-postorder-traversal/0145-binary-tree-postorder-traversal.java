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
    public List<Integer> postorderTraversal(TreeNode root)
    {
        List<Integer> r=new ArrayList<>();
        t(root,r);
        return r;

    }
    public void t(TreeNode node,List<Integer> r)
    {
        if(node==null)
        {
            return ;

        }
        t(node.left,r);
        t(node.right,r);
        r.add(node.val);
    }
}