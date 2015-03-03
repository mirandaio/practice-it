public void doubleSpace(Scanner sc, PrintStream ps) {
    while(sc.hasNextLine()) {
        ps.println(sc.nextLine());
        ps.println();
    }
}
