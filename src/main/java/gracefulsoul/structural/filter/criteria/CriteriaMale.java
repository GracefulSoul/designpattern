package gracefulsoul.structural.filter.criteria;

import java.util.ArrayList;
import java.util.List;

import gracefulsoul.structural.filter.person.Gender;
import gracefulsoul.structural.filter.person.Person;

public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<Person>();

		for (Person person : persons) {
			if (Gender.MALE.equals(person.getGender())) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}

}
