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
public class Company {
    
    private String name;

    public Company(String name) {
        this.name = name;
    } 

    public String getCompanyName() {
        return name;
    }

    public void setCompanyName(String name) {
        this.name = name;
    }
}
