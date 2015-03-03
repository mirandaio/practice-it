public void interleave(ArrayList<Integer> a1, ArrayList<Integer> a2) {
    int size1 = a1.size();
    int size2 = a2.size();
    int index1 = 0;
    int index2 = 0;
    boolean flag = true;
    
    while(index1 < size1 || index2 < size2) {
        if(index1 < size1 && flag) {
            a1.add(a1.get(index1));
            index1++;
        } else if(index2 < size2 && !flag) {
            a1.add(a2.get(index2));
            index2++;
        }
        flag = !flag;
    }
    
    a1.subList(0, size1).clear();
}
