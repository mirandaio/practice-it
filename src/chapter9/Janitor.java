public class Janitor extends Employee {
    public int getHours() {
        return 2 * super.getHours();
    }
    
    public double getSalary() {
        return super.getSalary() - 10000;
    }
    
    public int getVacationDays() {
        return super.getVacationDays() / 2;
    }
    
    public void clean() {
        System.out.println("Workin' for the man.");
    }
}
