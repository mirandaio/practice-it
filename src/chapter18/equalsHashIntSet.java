public boolean equals(Object object) {
    if(object instanceof HashIntSet) {
        HashIntSet set = (HashIntSet) object;

        if(size != set.size())
            return false;

        for(int i = 0; i < elementData.length; i++) {
            Node current = elementData[i];
            while(current != null) {
                if(!set.contains(current.data))
                    return false;
                current = current.next;
            }
        }

        return true;
    }

    return false;
}
