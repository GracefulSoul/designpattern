package gracefulsoul.other.businessDelegate.businessService;

public class DefaultService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking Default Service");
	}

}
