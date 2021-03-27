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
    
    private void trackRequest(String request) {
        System.out.println("Page requested: " + request);
    }
    
    public void dispatchRequest(String request) {
        //long each reqeust
        trackRequest(request);
        //authenticate the user
        if(isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }
    
}
