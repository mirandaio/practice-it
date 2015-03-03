public int[] append(int[] list1, int[] list2) {
    int[] a = new int[list1.length + list2.length];
    int i = 0;
    
    for(int j = 0; j < list1.length; j++) {
        a[i] = list1[j];
        i++;
    }
    
    for(int j = 0; j < list2.length; j++) {
        a[i] = list2[j];
        i++;
    }
    
    return a;
}
