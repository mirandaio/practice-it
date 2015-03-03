public class Window {
    public static final int SIZE = 3;
    
    public static void main(String[] args) {
        printLine();
        System.out.println();
        printWindow();
        printLine();
        System.out.println();
        printWindow();
        printLine();
    }
    
    public static void printLine() {
        System.out.print("+");
        
        for(int i = 0; i < SIZE; i++)
            System.out.print("=");
            
        System.out.print("+");
        
        for(int i = 0; i < SIZE; i++)
            System.out.print("=");
            
        System.out.print("+");
    }
    
    public static void printWindow() {
        for(int i = 0; i < SIZE; i++) {
            System.out.print("|");
            
            for(int j = 0; j < SIZE; j++)
                System.out.print(" ");
                
            System.out.print("|");
            
            for(int j = 0; j < SIZE; j++)
                System.out.print(" ");
                
            System.out.print("|");
            System.out.println();
        }
    }
}
