public Map<String, Integer> reverse(Map<Integer, String> map) {
    HashMap<String, Integer> reversed = new HashMap<String, Integer>();

    for(int key : map.keySet()) {
        String value = map.get(key);

        if(!reversed.containsKey(value)) {
            reversed.put(value, key);
        }
    }

    return reversed;
}
