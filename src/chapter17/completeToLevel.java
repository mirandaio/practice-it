public void completeToLevel(int n) {
    overallRoot = completeToLevel(overallRoot, n);
}

private IntTreeNode completeToLevel(IntTreeNode node, int n) {
    if(n < 1)
        throw new IllegalArgumentException();
        
    if(node == null)
        node = new IntTreeNode(-1);
        
    if(n == 1)
        return node;
        
    node.left = completeToLevel(node.left, n - 1);
    node.right = completeToLevel(node.right, n - 1);
    return node;
}
