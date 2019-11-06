package edu.voloshin.pawnhop13.services.person.impls;

import edu.voloshin.pawnhop13.models.Address;
import edu.voloshin.pawnhop13.models.Gender;
import edu.voloshin.pawnhop13.models.Passport;
import edu.voloshin.pawnhop13.models.Person;
import edu.voloshin.pawnhop13.repositorys.PassportRepository;
import edu.voloshin.pawnhop13.repositorys.PersonRepository;
import edu.voloshin.pawnhop13.services.address.impls.AddressServiceImpl;
import edu.voloshin.pawnhop13.services.person.interfaces.IPersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {

    List<Person> people = new ArrayList<>();

    @Autowired
    PersonRepository personRepository;


    @Autowired
    PassportRepository passportRepository;

    @Autowired
    AddressServiceImpl addressService;

    @Override
    public List<Person> getAll() {
        return personRepository.findAll();
    }

    @Override
    public Person get(String id) {
        return personRepository.findById(id).orElse(null);
    }

    @Override
    public Person delete(String id) {
        Person person = this.get(id);
        personRepository.deleteById(id);
        passportRepository.deleteById(person.getPassport().getId());
        return person;
    }

    @PostConstruct
    void init()
    {
        personRepository.deleteAll();
        List<Passport> passports = passportRepository.findAll();
        List<Address> addresses = addressService.getAll();
        System.out.println("fl3");
        for (Address address:addresses ) {
            System.out.println(address.getId());
        }
        System.out.println("fl4");
        int i = 1;
        for ( Passport passport:passports ) {
            people.add(new Person(passport, Gender.MAN,new Address(),""));
        }
        for (Person person:people) {
            person.setAddress(addresses.get(i++));
        }

        personRepository.saveAll(people);
    }
    @Override
    public Person update(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person create(Person person) {
        return personRepository.save(person);
    }
}
