package Employes;

public class Manager extends Empleat {
    public Manager(String name, String adress, String phone, double salaryMonth){
        super(name, adress, phone, salaryMonth);
    }
    
    private double salaryTotalManager;
    
    public double getSalaryTotalManager(){
        return salaryTotalManager = salaryMonth * 1.1;
    }
    
}
