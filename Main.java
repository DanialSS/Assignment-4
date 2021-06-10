package com.company;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;

            TreeNode() {
            }

            TreeNode(int val) {
                this.val = val;
            }

            TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }

        class Solution{
            public int deepestLeavesSum(TreeNode root){
                if(root == null){
                    return 0;
                }
                Queue<TreeNode> queue = new LinkedList();
                queue.add(root);

                int sum = 0;

                while(!queue.isEmpty()){
                    sum = 0;
                    int size = queue.size();

                    for(int i = 0; i < size; i++){
                        TreeNode node = queue.remove();

                        sum += node.val;

                        if(node.right != null){
                            queue.add(node.right);
                        }
                        if(node.left != null){
                            queue.add(node.left);
                        }
                    }
                }
                return sum;
            }
        }
    }
}
