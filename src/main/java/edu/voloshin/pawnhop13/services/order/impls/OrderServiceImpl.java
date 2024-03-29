package edu.voloshin.pawnhop13.services.order.impls;

import edu.voloshin.pawnhop13.models.Order;
import edu.voloshin.pawnhop13.models.Person;
import edu.voloshin.pawnhop13.models.Product;
import edu.voloshin.pawnhop13.repositorys.OrderRepository;
import edu.voloshin.pawnhop13.services.order.interfaces.IOrderService;
import edu.voloshin.pawnhop13.services.person.impls.PersonServiceImpl;
import edu.voloshin.pawnhop13.services.product.impls.ProductServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {

    List<Order> orders = new ArrayList<>();

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ProductServiceImpl productService;
    @Autowired
    PersonServiceImpl personService;

    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order get(String id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public Order delete(String id) {
        Order order = this.get(id);
        orderRepository.deleteById(id);
        return order;
    }

    @Override
    public Order update(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order create(Order order) {
        return orderRepository.save(order);
    }
    @PostConstruct
    void init(){
        orderRepository.deleteAll();
        List <Person> personList = personService.getAll();
        List<Product> products = productService.getAll();

        for (int i=0, j=0;i<personList.size();i++,j++) {
            orders.add(new Order(true,products.get(i), LocalDate.of(2019,11,9),
                    LocalDate.of(2019,12,9), 7000,13000,10000,
                    personList.get(j)));
        }

        orderRepository.saveAll(orders);

    }
}
    /*private String id;
    private boolean isActive;
    private  Product product;
    private LocalDate getDate;
    private LocalDate retDate;
    private double issuedMoney;//выдано денег
    private double sellingPrice;//цена продажи
    private double buybackPrice;//выкупная цена
    private Person person;*/
