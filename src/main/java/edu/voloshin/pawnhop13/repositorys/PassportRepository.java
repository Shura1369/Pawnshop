package edu.voloshin.pawnhop13.repositorys;


import edu.voloshin.pawnhop13.models.Passport;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportRepository extends MongoRepository<Passport, String> {

}
