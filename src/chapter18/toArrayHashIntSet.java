public int[] toArray() {
    int[] result = new int[size];
    int index = 0;

    for(int i = 0; i < elementData.length; i++) {
        Node current = elementData[i];

        while(current != null) {
            result[index] = current.data;
            index++;
            current = current.next;
        }
    }

    return result;
}
