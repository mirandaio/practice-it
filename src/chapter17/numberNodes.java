public int numberNodes() {
    return numberNodes(overallRoot, 1);
}

private int numberNodes(IntTreeNode node, int number) {
    if(node == null)
        return 0;
        
    node.data = number;
    int countLeft = numberNodes(node.left, number + 1);
    int countRight = numberNodes(node.right, number + countLeft + 1);
    
    return 1 + countLeft + countRight;
}
