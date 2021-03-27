package gracefulsoul.other.serviceLocator;

import gracefulsoul.other.serviceLocator.service.Service1;
import gracefulsoul.other.serviceLocator.service.Service2;

public class InitialContext {
    
    public Object lookup(String jndiName) {
        if (jndiName.equalsIgnoreCase("SERVICE1")) {
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        } else if (jndiName.equalsIgnoreCase("SERVICE2")) {
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }
    
}
