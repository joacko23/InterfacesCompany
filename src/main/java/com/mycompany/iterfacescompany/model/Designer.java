
package com.mycompany.iterfacescompany.model;

import com.mycompany.iterfacescompany.Interfaces.Employee;


public class Designer implements Employee {
    @Override
    public void doWork() {
        System.out.println("Diseñando la interfaz");
    }
    
}
