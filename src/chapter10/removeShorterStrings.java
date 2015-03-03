public void removeShorterStrings(ArrayList<String> list) {
    ArrayList<String> holder = new ArrayList<String>();
    int i = 0;

    while(i <= list.size() - 2) {
        if(list.get(i).length() > list.get(i+1).length())
            holder.add(list.get(i));
        else
            holder.add(list.get(i+1));

        i += 2;
    }

    if(i == list.size() - 1)
        holder.add(list.get(i));

    list.clear();
    list.addAll(holder);
}
