public void minToFront(ArrayList<Integer> arr) {
    int min = Integer.MAX_VALUE;
    int pos = -1;
    
    for(int i = 0; i < arr.size(); i++) {
        if(arr.get(i) < min) {
            min = arr.get(i);
            pos = i;
        }
    }
    
    arr.remove(pos);
    arr.add(0, min);
}
