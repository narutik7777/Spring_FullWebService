package Ilyas.service;

import Ilyas.db.model.Batch;

public interface BatchService {

    Iterable<Batch> findBySchool(Integer school);

}
