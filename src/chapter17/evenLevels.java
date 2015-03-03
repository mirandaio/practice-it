public void evenLevels() {
    overallRoot = evenLevels(overallRoot, 1);
}

private IntTreeNode evenLevels(IntTreeNode node, int level) {
    if(node == null)
        return null;
        
    if(node.left == null && node.right == null && level % 2 == 1)
        return null;
        
    node.left = evenLevels(node.left, level + 1);
    node.right = evenLevels(node.right, level + 1);
    return node;
}
