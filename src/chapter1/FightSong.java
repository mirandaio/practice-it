public class FightSong {
    public static void main(String[] args) {
        printGo();
        printNewLine();
        printParagraph();
        printNewLine();
        printParagraph();
        printNewLine();
        printGo();
    }
                                                                    
    public static void printGo() {
        System.out.println("Go, team, go!");
        System.out.println("You can do it.");
    }

    public static void printWest() {
        System.out.println("You're the best,");
        System.out.println("In the West.");
    }
    
    public static void printNewLine() {
        System.out.println();
    }

    public static void printParagraph() {
        printGo();
        printWest();
        printGo();
    }
}
