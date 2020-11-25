package Ilyas.service;

import Ilyas.db.model.School;

public interface SchoolService {

    Iterable<School> listAll();

    void delete(Integer id);
    
    School add(Integer number, String name);

}
