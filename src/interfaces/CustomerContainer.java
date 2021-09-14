package interfaces;
import java.util.List;

import model.*;
public interface CustomerContainer {
	
	List<Customer> getAllCustomers();
    void deleteCustomer(Customer customerToDelete);
    void updateCustomer(Customer customerToUpdate);
    void addCustomer(Customer customer);
}
