package model;

public class Customer{
	
	private int id;
	private String name;
	private int numberOfWeeksAsCustomer;
	
	
	public Customer(int id, String name, int numberOfWeeksAsCustomer) {
		setId(id);
		setName(name);
		setNumberOfWeeksAsCustomer(numberOfWeeksAsCustomer);
	}
	
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfWeeksAsCustomer() {
		return numberOfWeeksAsCustomer;
	}
	public void setNumberOfWeeksAsCustomer(int numberOfWeeksAsCustomer) {
		this.numberOfWeeksAsCustomer = numberOfWeeksAsCustomer;
	}
}