public boolean isUnique(Map<String, String> map) {
    HashSet<String> set = new HashSet<String>();

    for(String key : map.keySet()) {
        String value = map.get(key);

        if(set.contains(value))
            return false;

        set.add(value);
    }

    return true;
}
