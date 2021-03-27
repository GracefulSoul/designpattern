package gracefulsoul.other.businessDelegate;

import gracefulsoul.other.businessDelegate.businessService.BusinessService;
import gracefulsoul.other.businessDelegate.businessService.DefaultService;
import gracefulsoul.other.businessDelegate.businessService.EJBService;
import gracefulsoul.other.businessDelegate.businessService.JMSService;

public class BusinessLookUp {

	public BusinessService getBusinessService(ServiceType serviceType) {
		switch (serviceType) {
			case EJB:
				return new EJBService();
			case JMS:
				return new JMSService();
			default:
				return new DefaultService();
		}
	}

}
