package gracefulsoul.structural.filter;

import java.util.ArrayList;
import java.util.List;

import gracefulsoul.structural.filter.criteria.AndCriteria;
import gracefulsoul.structural.filter.criteria.Criteria;
import gracefulsoul.structural.filter.criteria.CriteriaFemale;
import gracefulsoul.structural.filter.criteria.CriteriaMale;
import gracefulsoul.structural.filter.criteria.CriteriaSingle;
import gracefulsoul.structural.filter.criteria.OrCriteria;
import gracefulsoul.structural.filter.person.Gender;
import gracefulsoul.structural.filter.person.MaritalStatus;
import gracefulsoul.structural.filter.person.Person;

public class CriteriaPatternMain {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Robert", Gender.MALE, MaritalStatus.SINGLE));
		persons.add(new Person("John", Gender.MALE, MaritalStatus.MARRIED));
		persons.add(new Person("Laura", Gender.FEMALE, MaritalStatus.MARRIED));
		persons.add(new Person("Diana", Gender.FEMALE, MaritalStatus.SINGLE));
		persons.add(new Person("Mike", Gender.MALE, MaritalStatus.SINGLE));
		persons.add(new Person("Bobby", Gender.MALE, MaritalStatus.SINGLE));

		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		Criteria single = new CriteriaSingle();
		Criteria singleMale = new AndCriteria(single, male);
		Criteria singleOrFemale = new OrCriteria(single, female);

		System.out.println("Males: ");
		printPersons(male.meetCriteria(persons));

		System.out.println("Females: ");
		printPersons(female.meetCriteria(persons));

		System.out.println("Single Males: ");
		printPersons(singleMale.meetCriteria(persons));

		System.out.println("Single Or Females: ");
		printPersons(singleOrFemale.meetCriteria(persons));
	}

	public static void printPersons(List<Person> persons) {
		for (Person person : persons) {
			System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender()
					+ ", Marital Status : " + person.getMaritalStatus() + " ]");
		}
	}

}