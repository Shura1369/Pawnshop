package edu.voloshin.pawnhop13.services.product.interfaces;

import edu.voloshin.pawnhop13.models.Product;


import java.util.List;

public interface IProductService {
    List<Product> getAll();

    Product get(String id);
    Product delete(String id);
    Product update(Product product);
    Product create(Product product);
}
