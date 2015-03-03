public class HarvardLawyer extends Lawyer {
    public double getSalary() {
        return 1.2 * super.getSalary();
    }
    
    public int getVacationDays() {
        return super.getVacationDays() + 3;
    }
    
    public String getVacationForm() {
        String form = super.getVacationForm();
        return form + form + form + form;
    }
}
