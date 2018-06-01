/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null){
            return res;
        }

        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            if(temp != null){
                res.add(temp.val);
                stack.push(temp.right);
                stack.push(temp.left);
            }
        }
        
        return res;
    }
}