public int depthSum() {
    return depthSum(overallRoot, 1);
}

private int depthSum(IntTreeNode node, int level) {
    if(node == null)
        return 0;
        
    return level * node.data +
        depthSum(node.left, level + 1) + depthSum(node.right, level + 1);
}
