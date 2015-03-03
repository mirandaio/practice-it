public void printDuplicates(Scanner sc) {
    while(sc.hasNextLine()) {
        Scanner line = new Scanner(sc.nextLine());
        String current = "";
        int count = 0;
        
        while(line.hasNext()) {
            String next = line.next();
            
            if(next.equals(current)) {
                count++;
            } else {
                if(count > 1)
                    System.out.print(current + "*" + count + " ");
                
                current = next;
                count = 1;
            }
        }
        
        if(count > 1)
            System.out.print(current + "*" + count);
        
        System.out.println();
    }
}
