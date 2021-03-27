package gracefulsoul.structural.filter.criteria;

import java.util.ArrayList;
import java.util.List;

import gracefulsoul.structural.filter.person.Gender;
import gracefulsoul.structural.filter.person.Person;

public class CriteriaFemale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> femalePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (Gender.FEMALE.equals(person.getGender())) {
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}

}
