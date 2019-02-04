/*
    题目：二叉树的层次遍历II
       给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
      List<List<Integer>> result = new LinkedList();
              if(root==null)
      {
          return result;
      }
      Queue<TreeNode> q = new LinkedList();
      q.add(root);
      while(!q.isEmpty())
      {
          int size = q.size();
           List<Integer> elem = new LinkedList();
          for(int i=0;i<size;i++)
          {
              TreeNode n = q.poll();
              if(n.left!=null)   q.add(n.left);
              if(n.right!=null)  q.add(n.right);
              elem.add(n.val);
           }
          result.add(0,elem);
    }
        return result;
}
}
