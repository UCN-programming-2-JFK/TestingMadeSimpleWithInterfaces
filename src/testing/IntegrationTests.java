package testing;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import controller.EasyToUnitTestCustomerController;
import interfaces.Configuration;
import interfaces.CustomerContainer;
import model.Customer;

public class IntegrationTests {
	
	@Test
	public void testGetNewCustomersReturnsOnlyNewCustomers() {
		
		//ARRANGE
		int newCustomerWeekLimit = 4;
		CustomerContainer container = new CustomerContainerStub();
		addCustomers(container);
		
		Configuration configuration = new ConfigurationStub(newCustomerWeekLimit);
		
		EasyToUnitTestCustomerController controller = new EasyToUnitTestCustomerController(container, configuration );
		
		//ACT
		List<Customer> newCustomers = controller.getNewCustomers();
		
		//ASSERT
		boolean areAllCustomersNew = checkAllCustomersAreNew(newCustomers, newCustomerWeekLimit);
		assertTrue(areAllCustomersNew);
	}
	

	
	private void addCustomers(CustomerContainer container) {
		container.addCustomer(new Customer(1, "Anna", 1));
		container.addCustomer(new Customer(2, "Bob", 2));
		container.addCustomer(new Customer(3, "Charles", 3));
		container.addCustomer(new Customer(4, "Dorothy", 4));
		container.addCustomer(new Customer(5, "Eric", 5));
		container.addCustomer(new Customer(6, "Frida", 6));
	}

	@Test
	public void testGetNewCustomersReturnsOnlyNewCustomersUsingInheritedStubs() {
		
		//ARRANGE
		int newCustomerWeekLimit = 4;
		CustomerContainer container = new CustomerContainerStub();
		Configuration configuration = new ConfigurationStub(newCustomerWeekLimit);
		
		EasyToUnitTestCustomerController controller = new EasyToUnitTestCustomerController(container, configuration );
		
		//ACT
		List<Customer> newCustomers = controller.getNewCustomers();
		
		
		//ASSERT
		boolean allCustomersAreNew = checkAllCustomersAreNew(newCustomers, newCustomerWeekLimit);
		assertTrue(allCustomersAreNew);
		
	}

	private boolean checkAllCustomersAreNew(List<Customer> newCustomers, int newCustomerWeekLimit) {
		
		for	(Customer customer : newCustomers) {
			if(customer.getNumberOfWeeksAsCustomer() > newCustomerWeekLimit) {
				return false;
			}
		}
		return true;
	}
	
	
}
