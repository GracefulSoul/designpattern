package gracefulsoul.other.businessDelegate;

import gracefulsoul.other.businessDelegate.businessService.BusinessService;
import gracefulsoul.other.businessDelegate.businessService.ServiceType;

public class BusinessDelegate {

	private BusinessLookUp lookupService = new BusinessLookUp();
	private BusinessService businessService;
	private ServiceType serviceType;

	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}

	public void doTask() {
		businessService = lookupService.getBusinessService(serviceType);
		businessService.doProcessing();
	}

}
