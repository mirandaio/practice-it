public List<Integer> inOrderList() {
    List<Integer> list = new LinkedList<Integer>();
    inOrderList(overallRoot, list);
    return list;
}

private void inOrderList(IntTreeNode node, List<Integer> list) {
    if(node == null)
        return;
        
    inOrderList(node.left, list);
    list.add(node.data);
    inOrderList(node.right, list);
}
