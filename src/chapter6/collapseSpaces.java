public void collapseSpaces(Scanner sc) {
    while(sc.hasNextLine()) {
        String line = sc.nextLine();
        Scanner linesc = new Scanner(line);
        
        while(linesc.hasNext())
            System.out.print(linesc.next() + " ");
        
        System.out.println();
    }
}
