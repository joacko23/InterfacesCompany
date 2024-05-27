
package com.mycompany.iterfacescompany.model;

import com.mycompany.iterfacescompany.Interfaces.Employee;


public class Programmer implements Employee{
    @Override
    public void doWork() {
        System.out.println("Programando");
    }
    
}
