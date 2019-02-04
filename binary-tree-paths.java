/*
  题目：二叉树的所有路径
  
  给定一个二叉树，返回所有从根节点到叶子节点的路径。
*/

/*code-finished_firstly*/
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
    public List<String> binaryTreePaths(TreeNode root) {
      List<String> result = new ArrayList<> ();
      if(root==null) return result;
      find(root,result,String.valueOf(root.val));
      return result; 
    }
    
    private List<String> find(TreeNode node,List<String> result,String str)
    {
        String s= new String ();
        if(node.left==null&&node.right==null)
        {
            result.add(str);
        }
        if(node.left!=null)
        {
            s=str+"->"+node.left.val;
            find(node.left,result,s);
        }
        if(node.right!=null)
        {
            s=str+"->"+node.right.val;
            find(node.right,result,s);
        }
        return result;
    }
}
