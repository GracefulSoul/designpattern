package gracefulsoul.other.businessDelegate;

import gracefulsoul.other.businessDelegate.businessService.ServiceType;
import gracefulsoul.other.businessDelegate.client.Client;

public class BusinessDelegatePatternMain {

	public static void main(String[] args) {

		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType(ServiceType.EJB);

		Client client = new Client(businessDelegate);
		client.doTask();

		businessDelegate.setServiceType(ServiceType.JMS);
		client.doTask();
	}

}