package gracefulsoul.other.interceptingFilter.filter;

import java.util.ArrayList;
import java.util.List;

import gracefulsoul.other.interceptingFilter.Target;

public class FilterChain {

	private List<Filter> filters = new ArrayList<Filter>();
	private Target target;

	public void addFilter(Filter filter) {
		filters.add(filter);
	}

	public void execute(String request) {
		for (Filter filter : filters) {
			filter.execute(request);
		}
		this.target.execute(request);
	}

	public void setTarget(Target target) {
		this.target = target;
	}

}
