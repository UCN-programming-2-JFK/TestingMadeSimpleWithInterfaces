package controller;

import java.util.List;

import interfaces.*;
import model.Customer;

public class EasyToUnitTestCustomerController implements CustomerController {

	private CustomerContainer customerContainer;
	private Configuration configuration;
	
	public EasyToUnitTestCustomerController(CustomerContainer container, Configuration configuration) {
		setCustomerContainer(container);
		setConfiguration(configuration);
	}
	
	@Override
	public List<Customer> getNewCustomers() {
		
		List<Customer> customers = getCustomerContainer().getAllCustomers();
		int numberOfWeeksWhichDefinesNewCustomers = getConfiguration().getNumberOfWeeksWhichDefinesNewCustomers();
		
		for (int customerCounter = customers.size() -1; customerCounter >= 0; customerCounter-- ) {
			if(customers.get(customerCounter).getNumberOfWeeksAsCustomer() > numberOfWeeksWhichDefinesNewCustomers) {
				customers.remove(customerCounter);
			}
		}
		
		return customers;
	}

	protected CustomerContainer getCustomerContainer() {
		return customerContainer;
	}

	protected void setCustomerContainer(CustomerContainer customerContainerr) {
		this.customerContainer = customerContainerr;
	}

	protected Configuration getConfiguration() {
		return configuration;
	}

	protected void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}
}