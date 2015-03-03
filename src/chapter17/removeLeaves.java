public void removeLeaves() {
    overallRoot = removeLeaves(overallRoot);
}

private IntTreeNode removeLeaves(IntTreeNode node) {
    if(node == null)
        return null;
        
    if(node.left == null && node.right == null)
        return null;
        
    node.left = removeLeaves(node.left);
    node.right = removeLeaves(node.right);
    return node;
}
