
package com.mycompany.iterfacescompany.model;

import com.mycompany.iterfacescompany.Interfaces.Company;
import com.mycompany.iterfacescompany.Interfaces.Employee;
import java.util.ArrayList;
import java.util.List;


public class OutsourcingCompany implements Company {
    
     @Override
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Designer());
        employees.add(new Artist());
        return employees;
    }

    @Override
    public void createSoftware() {
        List<Employee> employees = getEmployees();
        for (Employee employee : employees) {
            employee.doWork();
        }
    }
}
