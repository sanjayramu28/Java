package Salary;

public class SalaryMethods {
    int salary;
    public void setSalary(int amt){
        this.salary=amt;
    }
    public void getSalary(){
        System.out.println("Salary= "+salary);
    }
    public void incresaseSalary(int amt){
        this.salary=this.salary+amt;
    }
    public void DeduceSalary(int amt){
        this.salary=this.salary-amt;
    }
}
