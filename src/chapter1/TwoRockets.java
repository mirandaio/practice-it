public class TwoRockets {
    public static void main(String[] args) {
        printTriangle();
        printSquare();
        printUSA();
        printSquare();
        printTriangle();
    }
                                                    
    public static void printTriangle() {
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }

    public static void printSquare() {
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }

    public static void printUSA() {
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
    }
}
