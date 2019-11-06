package edu.voloshin.pawnhop13.repositorys;


import edu.voloshin.pawnhop13.models.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {
}
