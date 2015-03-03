public void removeInRange(ArrayList<Integer> list, int val, int start, 
    int end) {
    if(start > end)
        return;
    
    ArrayList<Integer> temp = new ArrayList<Integer>();
    
    for(int i = 0; i < start; i++)
        temp.add(list.get(i));
    
    for(int i = start; i < end; i++) {
        if(list.get(i) != val)
            temp.add(list.get(i));
    }
    
    for(int i = end; i < list.size(); i++)
        temp.add(list.get(i));
    
    list.clear();
    list.addAll(temp);
}
