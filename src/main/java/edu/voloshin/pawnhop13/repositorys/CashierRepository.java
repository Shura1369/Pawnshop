package edu.voloshin.pawnhop13.repositorys;


import edu.voloshin.pawnhop13.models.Cashier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CashierRepository extends MongoRepository<Cashier,String> {
}
