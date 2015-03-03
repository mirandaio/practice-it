public void swapPairs(ArrayList<String> list) {
    for(int i = 0; i <= list.size() - 2; i += 2) {
        String str = list.get(i + 1);
        list.set(i + 1, list.get(i));
        list.set(i, str);
    }
}
