public String toString2() {
    return toString2(overallRoot);
}

private String toString2(IntTreeNode node) {
    if(node == null)
        return "empty";
        
    if(node.left == null && node.right == null)
        return String.valueOf(node.data);
        
    return "(" + node.data + ", " + toString2(node.left) + ", " +
        toString2(node.right) + ")";
}
