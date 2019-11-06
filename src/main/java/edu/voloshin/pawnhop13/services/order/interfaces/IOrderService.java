package edu.voloshin.pawnhop13.services.order.interfaces;

import edu.voloshin.pawnhop13.models.Order;

import java.util.List;

public interface IOrderService {
    List<Order> getAll();
    Order get(String id);
    Order delete(String id);
    Order update(Order order);
    Order create(Order order);
}
