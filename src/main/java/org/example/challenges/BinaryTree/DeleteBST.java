package org.example.challenges.BinaryTree;

/*
link: https://leetcode.com/problems/delete-node-in-a-bst/
*/

public class DeleteBST {

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
        //parent = root
        // children = root.left e root.right
    public TreeNode deleteNode(TreeNode root, int key) {
        // Se root for null, retornamos null (árvore vazia)
        if (root == null){
            return null;
        }
        /*
        se key for maior que root.val,
        movemos o ponteiro para o node da direita
        e chamamos a função recursivamente
         */
        if (key > root.val){
            root.right = deleteNode(root.right , key);
        }
        /*
        se key for menor que root.val,
        movemos o ponteiro para o node da esquerda
        e chamamos a função recursivamente
         */
        else if (key < root.val){
            root.left = deleteNode(root.left , key);
        }
        //se key for igual a root.val, encontramos o node a ser removido
        else {
            /*
        se o node não tiver filho à esquerda (root.left == null),
        retornamos root.right.
        Pode ser null (se não houver filho à direita) ou um node válido
             */
            if (root.left == null){
                return root.right;
            }
             /*
        se o node não tiver filho à direita (root.right == null),
        retornamos root.left.
        Pode ser null (se não houver filho à esquerda) ou um node válido
             */
            else if (root.right == null){
                return root.left;
            }
            //nosso node atual tem dois filhos
            else {
                //chamamos a função para encontrar o menor valor na subárvore direita
                TreeNode minValue = findMinNodeValue(root.right);
                 /*
                substituímos o valor do node atual (root.val)
                pelo menor valor encontrado na subárvore direita
                 */
                root.val = minValue.val;
                 /*
                 movemos para o node da direita e utilizamos minValue.val como a nova key
                 para remover o node duplicado.
                  */
                root.right = deleteNode(root.right , minValue.val);
            }
        }
        //retorna a árvore com o valor já removido
        return root;
    }

    public TreeNode findMinNodeValue(TreeNode root) {
       //valor atual vai ser igual a root
       TreeNode current = root;
       /*
       enquanto current for diferente de null e current.left for diferente de null
       continuamos movendo para a esquerda
        */
        while (current != null && current.left != null) {
            /* o nosso current vai se mover para a esquerda e assim por diante,
            até current.left == null ou current == null
            */
            current = current.left;
        }
        //retornamos o nosso valor minimo
        return current;
    }
}
