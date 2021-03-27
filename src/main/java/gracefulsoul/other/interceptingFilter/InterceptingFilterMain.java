package gracefulsoul.other.interceptingFilter;

import gracefulsoul.other.interceptingFilter.filter.AuthenticationFilter;
import gracefulsoul.other.interceptingFilter.filter.DebugFilter;
import gracefulsoul.other.interceptingFilter.filter.FilterManager;

public class InterceptingFilterMain {
    
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());
        
        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
    
}
