package edu.voloshin.pawnhop13.services.pasport.interfaces;

import edu.voloshin.pawnhop13.models.Passport;


import java.util.List;

public interface IPassportService {
    List<Passport> getAll();
    Passport get(String id);
    Passport delete(String id);
    Passport update(Passport passport);
    Passport create(Passport passport);

}
