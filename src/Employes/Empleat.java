package Employes;

//Declaració de clase empleat
public class Empleat{
    
    //Declaració de variables de classe 
    protected String name;
    protected String adress;
    protected String phone;
    protected double salaryMonth;
    protected double aument;
    
     //Declaració del constructor i paràmetres 
    public Empleat(String name, String adress, String phone, double salaryMonth){
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.salaryMonth = salaryMonth;
    }

    public Empleat(String name, String adress, String phone){
        this.name = name;
        this.adress = adress;
        this.phone = phone;
    }
    
    public void setName(String name){//Setter
        this.name = name;
    }
    
    public String getName(){//Getter
        return  name;
    }
    
    public void setAdress(String adress){//Setter
        this.adress = adress;
    }
    
    public String getAdress(){//Getter
        return adress;
    }
    
    public void setPhone(String phone){//Setter
        this.phone = phone;
    }
    
    public String getPhone(){//Getter
        return  phone;
    }
    
    public void setSalaryMonth(double salaryMonth){//Setter
        this.salaryMonth = salaryMonth;
    }
    
    public double getSalaryMonth(){//Getter
        return salaryMonth; 
    }
    
}

    
    
    
    

