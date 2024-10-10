package org.example.challenges;

/*
link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/
*/

public class LCA {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    /*
    root = raiz
    p = node da esquerda;
    q = node da direita;
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        /*se root.val é maior que "p" e maior que "q",
        isso significa que ambos estão no node
        da esquerda
        * */
        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        /*se root.val é menor que "p" e menor que "q",
        isso significa que ambos estão no node
        da direita
        * */
        else if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        /*
        Se nenhuma das condições anteriores for atendida,
        então encontramos o nosso menor ancestral comum.
        */
        else {
            return root;
        }
    }
}


