public void filterRange(ArrayList<Integer> list, int min, int max) {
    ArrayList<Integer> temp = new ArrayList<Integer>();

    for(int n : list) {
        if(n < min || max < n)
            temp.add(n);
    }

    list.clear();
    list.addAll(temp);
}
