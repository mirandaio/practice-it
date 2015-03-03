public boolean isFull() {
    return isFull(overallRoot);
}

private boolean isFull(IntTreeNode node) {
    if(node == null)
        return true;
        
    if(node.left == null && node.right != null)
        return false;
        
    if(node.left != null && node.right == null)
        return false;
        
    return isFull(node.left) && isFull(node.right);
}
