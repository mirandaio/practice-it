public void trim(int min, int max) {
    overallRoot = trim(overallRoot, min, max);
}

private IntTreeNode trim(IntTreeNode node, int min, int max) {
    if(node == null)
        return null;
        
    if(node.data < min)
        return trim(node.right, min, max);
        
    if(node.data > max)
        return trim(node.left, min, max);
        
    node.left = trim(node.left, min, max);
    node.right = trim(node.right, min, max);
    return node;
}
