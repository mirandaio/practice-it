public void removeAll(HashIntSet set) {
    for(int i = 0; i < set.elementData.length; i++) {
        Node current = set.elementData[i];
        while(current != null) {
            remove(current.data);
            current = current.next;
        }
    }
}
