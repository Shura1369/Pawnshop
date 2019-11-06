package edu.voloshin.pawnhop13.controllers.rest;


import edu.voloshin.pawnhop13.models.Person;
import edu.voloshin.pawnhop13.services.person.impls.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/")
@RestController
public class PersonRestController {
    @Autowired
    PersonServiceImpl service;

    @RequestMapping("/person/list")
    List<Person> showAll(){
        return service.getAll();
    }
}
