package org.example.challenges.BinaryTree;

/*
link: https://leetcode.com/problems/search-in-a-binary-search-tree/description/
*/

public class SearchBST {

    //árvore binária
    public class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        TreeNode() {}
        public TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        //verifica se root é nulo
        if (root == null){
            return null;
        }
        /*verifica se o val é maior que o nosso valor root.
          Se sim, a gente vai para o node da direita e faz a
          mesma verificação.Caso não encontremos o valor, retornamos
          null.
        */
        if (val > root.val){
            return searchBST(root.right , val);
        }
        /*
        verifica se val é menor que o nosso valor root.
        Se sim , a gente vai para o node da esquerda e
        e vai verificando até achar o valor.Caso contrário
        retornamos null.
        */
        else if (val < root.val){
            return searchBST(root.left , val);
        }
        //se o val não é nulo , retornamos o root
        else{
            return root;
        }
    }
}