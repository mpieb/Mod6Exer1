package Employes;

public class NewMain {
    public static void main(String[] args) {
        Boss boss = new Boss("Pepe Boss", "Abat Oliva 6", "632458914", 100.0);
        System.out.println("name=" + boss.name + ", adress=" + boss.adress + 
                ", phone=" + boss.phone + ", salaryPerMonth=" 
                + boss.salaryMonth + "; totalP=" + boss.getSalaryTotalBoss());
        
        Employe employe = new Employe("Pedro Employe", "Escarre 12", "258147826", 40.0);
        System.out.println("name=" + employe.name + ", adress=" + employe.adress + 
                ", phone=" + employe.phone + ", salaryPerMonth=" 
                + employe.salaryMonth + "; totalP=" + employe.getSalaryTotalEmploye());
        
        Manager manager = new Manager("Toño Manager", "Pio 12", "528741569", 75.0);
        System.out.println("name=" + manager.name + ", adress=" + manager.adress + 
                ", phone=" + manager.phone + ", salaryPerMonth=" 
                + manager.salaryMonth + "; totalP=" + manager.getSalaryTotalManager());
        
        Volunteer volunteer = new Volunteer("Roco Volunter", "Traca 11", "6666666666");
        System.out.println("name=" + volunteer.name + ", adress=" + volunteer.adress + 
                ", phone=" + volunteer.phone + ", salaryPerMonth=" 
                + volunteer.getSalaryVolunteer() + "; totalP=" + volunteer.getSalaryTotalVolunteer());
    }
}
