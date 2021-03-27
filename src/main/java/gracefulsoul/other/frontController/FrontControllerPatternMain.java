package gracefulsoul.other.frontController;

public class FrontControllerPatternMain {

	public static void main(String[] args) {
		FrontController frontController = new FrontController();
		frontController.dispatchRequest(Request.HOME);
		frontController.dispatchRequest(Request.STUDENT);
	}

}
