package gracefulsoul.structural.filter.criteria;

import java.util.ArrayList;
import java.util.List;

import gracefulsoul.structural.filter.person.MaritalStatus;
import gracefulsoul.structural.filter.person.Person;

public class CriteriaMarried implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (MaritalStatus.MARRIED.equals(person.getMaritalStatus())) {
				singlePersons.add(person);
			}
		}
		return singlePersons;
	}

}
