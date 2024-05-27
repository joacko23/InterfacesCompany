
package com.mycompany.iterfacescompany.model;

import com.mycompany.iterfacescompany.Interfaces.Company;
import com.mycompany.iterfacescompany.Interfaces.Employee;
import java.util.ArrayList;
import java.util.List;


public class GameDevCompany implements Company {
    @Override
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Programmer());
        employees.add(new Tester());
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
