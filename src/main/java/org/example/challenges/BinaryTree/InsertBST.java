package org.example.challenges.BinaryTree;

/*
link: https://leetcode.com/problems/insert-into-a-binary-search-tree/
*/

public class InsertBST {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        /*
        Se root for null, retornamos
        um novo node com o valor que será inserido
        */
        if (root == null) {
            return new TreeNode(val);
        }
        /*
        Se val for maior que root.val, movemos o ponteiro
        para o node da direita e continuamos a busca
        até encontrar a posição correta para inserir o valor
         */
        if (val > root.val){
            root.right = insertIntoBST(root.right , val);
        }
        /*
        Se val for menor que root.val, movemos o ponteiro
        para o nó da esquerda e continuamos a busca
        até encontrar a posição correta para inserir o valor
         */
        else if (val < root.val){
            root.left = insertIntoBST(root.left , val);
        }
        /*
        retornamos root com o val já inserido
         */
        return root;
    }
}
