public void processName(Scanner console) {
    System.out.print("Please enter your full name: ");
    String name = console.nextLine();
    String[] parts = name.split("\\s+");
    System.out.println("Your name in reverse order is " + parts[1] + ", " +
        parts[0]);
}
