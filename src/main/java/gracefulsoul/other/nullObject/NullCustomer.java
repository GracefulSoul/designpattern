package gracefulsoul.other.nullObject;

public class NullCustomer extends AbstractCustomer {
    
    @Override
    public String getName() {
        return "NotAvailable in Customer Database";
    }
    
    @Override
    public boolean isNil() {
        return true;
    }
    
}
