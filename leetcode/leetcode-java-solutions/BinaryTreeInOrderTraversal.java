class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {

        TreeNode current = root;
        Stack<TreeNode> nodeStack= new Stack<>();
        List<Integer> inOrderList = new ArrayList<>();
        if (root == null) {
            return inOrderList;
        }
        while (!nodeStack.isEmpty() || current != null) {
            while (current != null) {
                nodeStack.push(current);
                current = current.left;
            }
            current = nodeStack.pop();
            inOrderList.add(current.val);
            current = current.right;
        }
        return inOrderList;
    }
}