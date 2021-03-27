package gracefulsoul.other.businessDelegate.client;

import gracefulsoul.other.businessDelegate.BusinessDelegate;

public class Client {

	BusinessDelegate businessService;

	public Client(BusinessDelegate businessService) {
		this.businessService = businessService;
	}

	public void doTask() {
		businessService.doTask();
	}

}