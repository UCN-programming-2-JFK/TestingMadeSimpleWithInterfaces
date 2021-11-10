package container;

import interfaces.Configuration;

public class FilebasedConfiguration implements Configuration{

	
	public FilebasedConfiguration(String configurationFilePath) {
	
		readConfigurationFromFile(configurationFilePath);
	}
	
	private void readConfigurationFromFile(String configurationFilePath) {
		// TODO implement reading configuration from file
		
	}

	@Override
	public int getNumberOfWeeksWhichDefinesNewCustomers() {
		// TODO use the actual value read from config file
		return 4;
	}

}
