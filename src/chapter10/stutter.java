public void stutter(ArrayList<String> list, int k) {
    ArrayList<String> temp = new ArrayList<String>();

    for(String str : list) {
        for(int i = 0; i < k; i++)
            temp.add(str);
    }

    list.clear();
    list.addAll(temp);
}
