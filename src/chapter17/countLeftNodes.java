public int countLeftNodes() {
    return countLeftNodes(overallRoot);
}

private int countLeftNodes(IntTreeNode node) {
    if(node == null)
        return 0;
        
    int count = countLeftNodes(node.right);
    
    if(node.left != null)
        count += 1 + countLeftNodes(node.left);
        
    return count;
}
