public void removeInRange(List<Integer> list, int val, int start, int end) {
    if(start > end)
        return;

    List<Integer> holder = new LinkedList<Integer>();

    for(int i = 0; i < start; i++)
        holder.add(list.get(i));

    for(int i = start; i < end; i++) {
        if(list.get(i) != val)
            holder.add(list.get(i));
    }

    for(int i = end; i < list.size(); i++)
        holder.add(list.get(i));

    list.clear();
    list.addAll(holder);
}
