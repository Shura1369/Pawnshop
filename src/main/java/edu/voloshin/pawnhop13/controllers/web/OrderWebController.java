package edu.voloshin.pawnhop13.controllers.web;


import edu.voloshin.pawnhop13.models.Order;
import edu.voloshin.pawnhop13.services.conteiner.impl.ConteinerIdServiceImpl;
import edu.voloshin.pawnhop13.services.order.impls.OrderServiceImpl;
import edu.voloshin.pawnhop13.services.person.impls.PersonServiceImpl;
import edu.voloshin.pawnhop13.services.product.impls.ProductServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/order")
@CrossOrigin("*")
@Controller
public class OrderWebController {
    @Autowired
    PersonServiceImpl personService;
    @Autowired
    ProductServiceImpl productService;
    @Autowired
    OrderServiceImpl orderService;

    @Autowired
    ConteinerIdServiceImpl conteinerIdService;

    @RequestMapping(value = "/list")
    public String showAll(Model model){
        List<Order> orders = orderService.getAll();
        model.addAttribute("orders", orders);
        return "orderlist";
    }
}

