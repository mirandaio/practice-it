public void flipLines(Scanner sc) {
    while(sc.hasNextLine()) {
        String temp = sc.nextLine();
        
        if(!sc.hasNextLine()) {
            System.out.println(temp);
            break;
        }
        
        System.out.println(sc.nextLine());
        System.out.println(temp);
    }
}
