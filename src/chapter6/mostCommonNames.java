public int mostCommonNames(Scanner sc) {
    int unique = 0;
    
    while(sc.hasNextLine()) {
        Scanner line = new Scanner(sc.nextLine());
        unique++;
        int maxCount = 1;
        String maxName = line.next();
        int count = 1;
        String prevName = maxName;
        
        while(line.hasNext()) {
            String currentName = line.next();
            
            if(currentName.equals(prevName)) {
                count++;
            } else {
                if(count > maxCount) {
                    maxCount = count;
                    maxName = prevName;
                }
                
                unique++;
                count = 1;
                prevName = currentName;
            }
        }
        
        if(count > maxCount)
            maxName = prevName;
        
        System.out.println("Most common: " + maxName);
    }
    
    return unique;
}
