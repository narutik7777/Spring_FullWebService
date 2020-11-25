package Ilyas.service;

import Ilyas.db.dao.BatchRepository;
import Ilyas.db.model.Batch;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BatchServiceImpl implements BatchService {

    private final static Logger log = Logger.getLogger(SchoolServiceImpl.class);

    @Autowired
    private BatchRepository batchRepository;

    @Override
    public Iterable<Batch> findBySchool(Integer school) {
        return batchRepository.findBySchool(school);
    }

}
