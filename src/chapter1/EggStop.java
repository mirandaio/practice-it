public class EggStop {
    public static void main(String[] args) {
        printEgg();
        System.out.println();
        printEgg();
        printLine();
        System.out.println();
        printTop();
        printStop();
        printBottom();
        printLine();
    }
    
    public static void printEgg() {
        printTop();
        printBottom();
    }
    
    public static void printLine() {
        System.out.println("+--------+");
    }
    
    public static void printTop() {
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }
    
    public static void printBottom() {
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }
    
    public static void printStop() {
        System.out.println("|  STOP  |");
    }
}
