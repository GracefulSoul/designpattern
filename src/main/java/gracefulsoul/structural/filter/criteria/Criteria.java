package gracefulsoul.structural.filter.criteria;

import java.util.List;

import gracefulsoul.structural.filter.person.Person;

public interface Criteria {

	public List<Person> meetCriteria(List<Person> persons);

}
