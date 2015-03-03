public void wordLengths(Scanner sc) {
    int[] counts = new int[80];
    
    while(sc.hasNext()) {
        String str = sc.next();
        counts[str.length() - 1]++;
    }
    
    for(int i = 0; i < counts.length; i++) {
        if(counts[i] > 0) {
            System.out.print((i+1) + ": " + counts[i] + "\t");
            for(int j = 0; j < counts[i]; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
