public int longestSortedSequence() {
    if(size == 0)
        return 0;

    int max = 1;
    int length = 1;

    for(int i = 1; i < size; i++) {
        if(elementData[i - 1] <= elementData[i]) {
            length++;
        } else {
            if(length > max) {
                max = length;
            }
            length = 1;
        }
    }

    return Math.max(max, length);
}
