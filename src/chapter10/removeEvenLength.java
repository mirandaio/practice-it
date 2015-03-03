public void removeEvenLength(ArrayList<String> list) {
    ArrayList<String> temp = new ArrayList<String>();

    for(int i = 0; i < list.size(); i++) {
        if(list.get(i).length() % 2 == 1)
            temp.add(list.get(i));
    }

    list.clear();
    list.addAll(temp);
}
