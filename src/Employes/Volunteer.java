package Employes;

public class Volunteer extends Empleat {
    public Volunteer(String name, String adress, String phone){
        super(name, adress, phone);
    }
    
    private String salaryVolunteer;
    private double salaryTotalVolunteer = 0.0;
    
    public String getSalaryVolunteer(){
        return " No cobra!";
    }
    
    public double getSalaryTotalVolunteer(){
        return salaryTotalVolunteer;
    }
    
}
