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
public class Department extends Company{
    
    private String name;

    public Department(String nameOfCompany, String nameOfDepartment) {
        super(nameOfCompany);
        this.name = nameOfDepartment;
    }

    public String getDepartmentName() {
        return name;
    }

    public void setDepartmentName(String name) {
        this.name = name;
    }   
    
}
