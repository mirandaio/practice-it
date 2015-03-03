public boolean isPairwiseSorted() {
    for(int i = 0; i <= size - 2; i+=2) {
        if(elementData[i] > elementData[i+1])
            return false;
    }

    return true;
}
