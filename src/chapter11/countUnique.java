public int countUnique(List<Integer> list) {
    HashSet<Integer> set = new HashSet<Integer>();

    for(int n : list)
        set.add(n);

    return set.size();
}
