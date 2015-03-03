public int rarest(Map<String, Integer> map) {
    HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
    int rarest = Integer.MAX_VALUE;
    int numRarest = Integer.MAX_VALUE;

    for(String key : map.keySet()) {
        int value = map.get(key);

        if(hashmap.containsKey(value)) {
            hashmap.put(value, hashmap.get(value) + 1);
        } else {
            hashmap.put(value, 1);
        }
    }

    for(int key : hashmap.keySet()) {
        int value = hashmap.get(key);

        if(value < numRarest) {
            rarest = key;
            numRarest = value;
        } else if(value == numRarest) {
            rarest = key < rarest ? key : rarest;
        }
    }

    return rarest;
}
