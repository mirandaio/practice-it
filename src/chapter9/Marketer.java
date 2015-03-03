public class Marketer extends Employee {
    public void advertise() {
        System.out.println("Act now, while supplies last!");
    }
    
    public double getSalary() {
        return super.getSalary() + 10000.0;
    }
}
