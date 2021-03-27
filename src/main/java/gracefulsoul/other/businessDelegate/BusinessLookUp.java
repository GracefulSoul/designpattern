package gracefulsoul.other.businessDelegate;

import gracefulsoul.other.businessDelegate.businessService.BusinessService;
import gracefulsoul.other.businessDelegate.businessService.EJBService;
import gracefulsoul.other.businessDelegate.businessService.JMSService;

public class BusinessLookUp {
    
    public BusinessService getBusinessService(String serviceType) {
        if(serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
    
}
