package gracefulsoul.other.frontController;

public class FrontController {

	private Dispatcher dispatcher;

	public FrontController() {
		this.dispatcher = new Dispatcher();
	}

	private boolean isAuthenticUser() {
		System.out.println("User is authenticated successfully.");
		return true;
	}

	private void trackRequest(Request request) {
		System.out.println("Page requested: " + request.name());
	}

	public void dispatchRequest(Request request) {
		// Long each request.
		trackRequest(request);
		// Authenticate the user.
		if (isAuthenticUser()) {
			dispatcher.dispatch(request);
		}
	}

}
