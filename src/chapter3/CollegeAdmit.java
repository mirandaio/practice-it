public class CollegeAdmit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("University admission program");
        System.out.print("What is your GPA? ");
        double gpa = console.nextDouble();
        System.out.print("What is your SAT score? ");
        int sat = console.nextInt();
        
        if(gpa < 1.8) {
            System.out.println("Your GPA is too low.");
        } else if(sat < 900) {
            System.out.println("Your SAT score is too low.");
        } else {
            System.out.println("You were accepted!");
        }
    }
}
