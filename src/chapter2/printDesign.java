public static void printDesign() {
    for(int i = 1; i <= 9; i+=2) {
        for(int j = 0; j < (11 - i) / 2; j++)
            System.out.print("-");
            
        for(int j = 0; j < i; j++)
            System.out.print(i);
            
        for(int j = 0; j < (11 - i) / 2; j++)
            System.out.print("-");
            
        System.out.println();
    }
}
