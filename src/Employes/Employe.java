package Employes;

public class Employe extends Empleat {
    public Employe(String name, String adress, String phone, double salaryMonth){
        super(name, adress, phone, salaryMonth);
    }
    
    private double salaryTotalEmploye;
    
    public double getSalaryTotalEmploye(){
        return salaryTotalEmploye = salaryMonth * 0.85;
    }
    
}
