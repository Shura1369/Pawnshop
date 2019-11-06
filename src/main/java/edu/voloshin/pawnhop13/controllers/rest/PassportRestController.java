package edu.voloshin.pawnhop13.controllers.rest;


import edu.voloshin.pawnhop13.models.Passport;
import edu.voloshin.pawnhop13.services.pasport.impls.PassportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/")
@RestController
public class PassportRestController {
    @Autowired
    PassportServiceImpl service;

    @RequestMapping("/passport/list")
    public  List<Passport> showAll(){
        return service.getAll();
    }

}
