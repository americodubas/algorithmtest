class TreeNode {

    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TreeNode){
            return this.value == ((TreeNode) obj).value;
        }
        return false;
    }
}