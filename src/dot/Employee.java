/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dot;

/**
 *
 * @author Amalia
 */
public class Employee extends Department{
    
    private String name;
    private String title;
    private Integer salary;

    public Employee(String nameOfEmployee, String title, Integer salary, String nameOfCompany, String nameOfDepartment) {
        super(nameOfCompany, nameOfDepartment);
        this.name = nameOfEmployee;
        this.title = title;
        this.salary = salary;
    }    
    
    public void setEmployeeName(String name) {
        this.name = name;
    }

    public String getEmployeeName() {
        return name;
    }

    public String getEmployeeTitle() {
        return title;
    }

    public Integer getEmployeeMonthlySalary(Integer day) {
        this.salary = salary * day;
        return salary;
    }

    public void getData(){
        System.out.println("Nama Perusahaan\t: "+ super.getCompanyName());
        System.out.println("Nama Department\t: "+ super.getDepartmentName());
        System.out.println("Nama Pegawai\t: "+getEmployeeName());
        System.out.println("Title Pegawai\t: "+getEmployeeTitle());
        System.out.println("Total Salary\t: "+salary);
        System.out.println("=========================================");
    }
}
