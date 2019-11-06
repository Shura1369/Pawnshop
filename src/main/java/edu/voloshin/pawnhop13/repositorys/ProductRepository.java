package edu.voloshin.pawnhop13.repositorys;


import edu.voloshin.pawnhop13.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product,String> {
}
