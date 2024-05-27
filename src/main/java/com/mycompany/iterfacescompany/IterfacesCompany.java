

package com.mycompany.iterfacescompany;

import com.mycompany.iterfacescompany.Interfaces.Company;
import com.mycompany.iterfacescompany.model.GameDevCompany;
import com.mycompany.iterfacescompany.model.OutsourcingCompany;


public class IterfacesCompany {

    public static void main(String[] args) {
        Company gameDevCompany = new GameDevCompany();
        Company outsourcingCompany = new OutsourcingCompany();

        System.out.println("GameDevCompany creando software:");
        gameDevCompany.createSoftware();

        System.out.println("\nOutsourcingCompany creando software:");
        outsourcingCompany.createSoftware();
    }
}
