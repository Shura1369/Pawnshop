package edu.voloshin.pawnhop13.controllers.rest;



import edu.voloshin.pawnhop13.models.Product;
import edu.voloshin.pawnhop13.services.product.impls.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/")
@RestController
public class ProductRestController {

    @Autowired
    ProductServiceImpl productService;

    @RequestMapping("/product/list")
    List<Product> showAll(){
        return productService.getAll();
    }
}
