public int maxOccurrences(List<Integer> list) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    int modeVal = 0;

    for(int n : list) {
        if(map.containsKey(n)) {
            map.put(n, map.get(n) + 1);
        } else {
            map.put(n, 1);
        }

        if(map.get(n) > modeVal)
            modeVal = map.get(n);
    }

    return modeVal;
}
