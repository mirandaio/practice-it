public Map<String, Integer> intersect(Map<String, Integer> m1,
    Map<String, Integer> m2) {
    HashMap<String, Integer> map = new HashMap<String, Integer>();

    for(String key : m1.keySet()) {
        if(m2.containsKey(key) && m1.get(key) == m2.get(key))
            map.put(key, m1.get(key));
    }

    return map;
}
