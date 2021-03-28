package gracefulsoul.other.serviceLocator;

import gracefulsoul.other.serviceLocator.service.Service;

public class ServiceLocatorpatternMain {

	public static void main(String[] args) {
		Service service = ServiceLocator.getService("Service1");
		service.execute();
		service = ServiceLocator.getService("Service2");
		service.execute();
		service = ServiceLocator.getService("Service1");
		service.execute();
		service = ServiceLocator.getService("Service2");
		service.execute();
	}

}
