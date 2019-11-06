package edu.voloshin.pawnhop13.services.address.interfaces;

import edu.voloshin.pawnhop13.models.Address;


import java.util.List;

public interface IAddressService {
    List<Address> getAll();
    Address get(String id);
    Address delete(String id);
    Address update(Address address);
    Address create(Address address);
}
