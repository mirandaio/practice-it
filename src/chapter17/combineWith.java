public IntTree combineWith(IntTree t2) {
    IntTree t3 = new IntTree();
    t3.overallRoot = combineWith(overallRoot, t2.overallRoot);
    return t3;
}

private IntTreeNode combineWith(IntTreeNode n1, IntTreeNode n2) {
    if(n1 == null && n2 == null)
        return null;
        
    IntTreeNode n3;
    
    if(n1 == null) {
        n3 = new IntTreeNode(2);
        n3.left = combineWith(null, n2.left);
        n3.right = combineWith(null, n2.right);
    } else if(n2 == null) {
        n3 = new IntTreeNode(1);
        n3.left = combineWith(n1.left, null);
        n3.right = combineWith(n1.right, null);
    } else {
        n3 = new IntTreeNode(3);
        n3.left = combineWith(n1.left, n2.left);
        n3.right = combineWith(n1.right, n2.right);
    }
    
    return n3;
}
