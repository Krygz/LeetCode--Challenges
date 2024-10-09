package org.example;

import org.example.challenges.SearchBST;

public class Main {
    public static void main(String[] args) {
        SearchBST searchBST = new SearchBST();
        SearchBST.TreeNode root = searchBST.new TreeNode(4);
        root.left = searchBST.new TreeNode(2);
        root.right = searchBST.new TreeNode(7);
        root.left.left = searchBST.new TreeNode(1);
        root.left.right = searchBST.new TreeNode(3);

        int target = 2;
        SearchBST.TreeNode result = searchBST.searchBST(root, target);

        if (result != null) {
            System.out.println("Valor encontrado: " + result.val);
        } else {
            System.out.println("Valor " + target + " não encontrado na árvore.");
        }
    }
}
