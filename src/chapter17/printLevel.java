public void printLevel(int n) {
    if(n < 1)
        throw new IllegalArgumentException();
        
    printLevel(overallRoot, n);
}

private void printLevel(IntTreeNode node, int n) {
    if(node == null)
        return;
        
    if(n == 1) {
        System.out.println(node.data);
        return;
    }
    
    printLevel(node.left, n - 1);
    printLevel(node.right, n - 1);
}
