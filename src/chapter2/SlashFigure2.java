public class SlashFigure2 {
    public static final int SIZE = 6;
    
    public static void main(String[] args) {
        for(int i = 1; i <= SIZE; i++) {
            for(int j = 0; j < 2 * i - 2; j++)
                System.out.print("\\");
                
            for(int j = 0; j < -4 * i + 4 * SIZE + 2; j++)
                System.out.print("!");
                
            for(int j = 0; j < 2 * i - 2; j++)
                System.out.print("/");
                
            System.out.println();
        }
    }
}
