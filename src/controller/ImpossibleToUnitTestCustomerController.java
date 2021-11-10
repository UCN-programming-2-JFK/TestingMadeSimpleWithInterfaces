package controller;

import java.util.List;

import container.DatabaseCustomerContainer;
import container.FilebasedConfiguration;
import interfaces.*;
import model.Customer;

public class ImpossibleToUnitTestCustomerController {
	
	public List<Customer> getNewCustomers() {
		
		//PROBLEM - this method instantiates the objects it depends on: DatabaseCustomerContainer and FilebasedConfiguration
		//	instead of receiving them in the constructor
		//ALSO - this method relies on specific classes instead of interfaces (contracts) 
		List<Customer> customers = new DatabaseCustomerContainer().getAllCustomers();
		int numberOfWeeksWhichDefinesNewCustomers = new FilebasedConfiguration("C:\\config\\ourapp.cfg").getNumberOfWeeksWhichDefinesNewCustomers();
		
		//filters customers out which are not new
		for (int customerCounter = customers.size() -1; customerCounter >= 0; customerCounter-- ) {
			if(customers.get(customerCounter).getNumberOfWeeksAsCustomer() < numberOfWeeksWhichDefinesNewCustomers) {
				customers.remove(customerCounter);
			}
		}
		
		return customers;
	}	
}