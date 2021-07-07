package Employes;

public class Boss extends Empleat {
    public Boss(String name, String adress, String phone, double salaryMonth){
        super(name, adress, phone, salaryMonth);
    }
    
    private double salaryTotalBoss;
    
    public double getSalaryTotalBoss(){
        return salaryTotalBoss = salaryMonth * 1.5;
    }
    
}
