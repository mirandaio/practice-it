public void markLength4(ArrayList<String> list) {
    ArrayList<String> holder = new ArrayList<String>();

    for(String str : list) {
        if(str.length() == 4) {
            holder.add("****");
        }
        holder.add(str);
    }

    list.clear();
    list.addAll(holder);
}
