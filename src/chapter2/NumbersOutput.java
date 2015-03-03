public class NumbersOutput {
    public static final int NUM_REPETITIONS = 6;
    public static final int NUM_RANGE = 10;
    
    public static void main(String[] args) {
        for(int i = 0; i < NUM_REPETITIONS; i++) {
            for(int j = 0; j < NUM_RANGE - 1; j++)
                System.out.print(" ");
                
            System.out.print("|");
        }
        
        System.out.println();
        
        for(int i = 1; i <= NUM_REPETITIONS * NUM_RANGE; i++)
            System.out.print(i % NUM_RANGE);
    }
}
