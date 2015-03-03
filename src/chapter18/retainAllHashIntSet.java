public void retainAll(HashIntSet set) {
    for(int i = 0; i < elementData.length; i++) {
        Node prev = null;
        Node current = elementData[i];

        while(current != null) {
            if(!set.contains(current.data)) {
                if(prev == null)
                    elementData[i] = current.next;
                else
                    prev.next = current.next;

                size--;
                break;
            } else {
                prev = current;
                current = current.next;
            }
        }
    }
}
