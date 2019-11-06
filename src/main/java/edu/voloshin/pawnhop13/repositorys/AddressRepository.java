package edu.voloshin.pawnhop13.repositorys;


import edu.voloshin.pawnhop13.models.Address;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends MongoRepository<Address, String> {
}
