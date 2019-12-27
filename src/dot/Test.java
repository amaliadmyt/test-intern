/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dot;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Amalia
 */
public class Test {
    
    private final List<Employee> companyList = new ArrayList<>();
       
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("============INFORMASI KARYAWAN==========");
        System.out.println("========================================");
        
        Test test  = new Test();
        
        Employee employee_1 = new Employee("Rini Kusuma", "Lead Human Resource", 50000 , "PT. Abadi Jaya", "Human Resource");
        test.addCompany(employee_1, employee_1.getEmployeeMonthlySalary(30));
        
        Employee employee_2 = new Employee("Sindy Rosita", "Junior Sales", 50000 , "PT. Yakiniku", "Sales");
        test.addCompany(employee_2, employee_2.getEmployeeMonthlySalary(24));
        
        test.showCompany();
                
    }
    
     public void addCompany(Employee employee, Integer days){
        companyList.add(employee);
    }
     
    public void showCompany(){
        for(int i = 0; i < companyList.size(); i++){
            Employee employee = (Employee) companyList.get(i);
            employee.getData();
        }
    }
}
