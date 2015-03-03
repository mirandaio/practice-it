public void makePerfect() {
    int h = height();
    overallRoot = makePerfect(overallRoot, h);
}

private IntTreeNode makePerfect(IntTreeNode node, int h) {
    if(h <= 0)
        return null;
        
    if(node == null)
        node = new IntTreeNode(0);
        
    node.left = makePerfect(node.left, h - 1);
    node.right = makePerfect(node.right, h - 1);
    return node;
}

public int height() {
    return height(overallRoot);
}

private int height(IntTreeNode root) {
    if(root == null) {
        return 0;
    } else {
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
