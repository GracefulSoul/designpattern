package gracefulsoul.other.filter.criteria;

import java.util.List;

import gracefulsoul.other.filter.person.Person;

public interface Criteria {
    
    public List<Person> meetCriteria(List<Person> persons);
    
}
