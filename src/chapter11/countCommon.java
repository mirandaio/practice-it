public int countCommon(List<Integer> list1, List<Integer> list2) {
    HashSet<Integer> set1 = new HashSet<Integer>(list1);
    HashSet<Integer> set2 = new HashSet<Integer>(list2);
    int count = 0;

    for(int n : set2) {
        if(set1.contains(n))
            count++;
    }

    return count;
}
