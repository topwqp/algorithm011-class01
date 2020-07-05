class Solution {
    public List < Integer > inorderTraversal(TreeNode root) {
        List < Integer > result = new ArrayList < > ();
        inOrderHandle(root, result);
        return result;
    }

    public void  inOrderHandle(TreeNode root, List < Integer > result) {
        if (root != null) {
            if (root.left != null) {
                inOrderHandle(root.left, result);
            }
            result.add(root.val);
            if (root.right != null) {
                inOrderHandle(root.right, result);
            }
        }
    }
}