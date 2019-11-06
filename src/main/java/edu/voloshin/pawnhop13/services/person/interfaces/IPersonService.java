package edu.voloshin.pawnhop13.services.person.interfaces;



import edu.voloshin.pawnhop13.models.Person;

import java.util.List;

public interface IPersonService {
    List<Person> getAll();
    Person get(String id);
    Person delete(String id);
    Person update(Person person);
    Person create(Person person);
}
