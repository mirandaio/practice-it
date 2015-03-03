public boolean equals2(IntTree t2) {
    return equals2(overallRoot, t2.overallRoot);
}

private boolean equals2(IntTreeNode n1, IntTreeNode n2) {
    if(n1 == null && n2 == null)
        return true;
        
    if(n1 == null && n2 != null)
        return false;
        
    if(n1 != null && n2 == null)
        return false;
        
    return n1.data == n2.data && equals2(n1.left, n2.left) &&
        equals2(n1.right, n2.right);
}
