package gracefulsoul.other.frontController;

public class FrontControllerPatternMain {
    
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
    
}
