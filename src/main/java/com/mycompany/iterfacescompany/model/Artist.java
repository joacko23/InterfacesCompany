
package com.mycompany.iterfacescompany.model;

import com.mycompany.iterfacescompany.Interfaces.Employee;


public class Artist implements Employee {
    
    @Override
    public void doWork() {
        System.out.println("Creando arte");
    }
    
}
