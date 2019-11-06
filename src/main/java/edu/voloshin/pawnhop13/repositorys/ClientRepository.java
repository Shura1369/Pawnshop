package edu.voloshin.pawnhop13.repositorys;


import edu.voloshin.pawnhop13.models.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends MongoRepository<Client,String> {
}
