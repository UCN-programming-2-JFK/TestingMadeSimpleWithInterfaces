package testing;

import interfaces.Configuration;

public class ConfigurationStub implements Configuration{

	private int numberOfWeeksWhichDefinesNewCustomer;
	
	public ConfigurationStub(int numberOfWeeksWhichDefinesNewCustomer) {
		setNumberOfWeeksWhichDefinesNewCustomers(numberOfWeeksWhichDefinesNewCustomer);
	}
	
	@Override
	public int getNumberOfWeeksWhichDefinesNewCustomers() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private void setNumberOfWeeksWhichDefinesNewCustomers(int numberOfWeeks) {
		
		this.numberOfWeeksWhichDefinesNewCustomer = numberOfWeeks;
	}

}
