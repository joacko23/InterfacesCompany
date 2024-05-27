
package com.mycompany.iterfacescompany.model;

import com.mycompany.iterfacescompany.Interfaces.Employee;


public class Tester implements Employee {
    
    @Override
    public void doWork() {
        System.out.println("Probando el software");
    }
    
}
