package gracefulsoul.other.serviceLocator;

import gracefulsoul.other.serviceLocator.service.Service;

public class ServiceLocator {

	private static Cache cache = new Cache();
	private static InitialContext context = new InitialContext();

	public static Service getService(String jndiName) {
		Service service = cache.getService(jndiName);
		if (service != null) {
			return service;
		} else {
			Service service1 = (Service) context.lookup(jndiName);
			cache.addService(service1);
			return service1;
		}
	}

}
