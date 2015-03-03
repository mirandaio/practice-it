public int countEvenBranches() {
    return countEvenBranches(overallRoot);
}

private int countEvenBranches(IntTreeNode node) {
    if(node == null)
        return 0;
        
    int count = 0;
    
    if(node.data % 2 == 0 && (node.left != null || node.right != null))
        count++;
        
    return count + countEvenBranches(node.left) +
        countEvenBranches(node.right);
}
