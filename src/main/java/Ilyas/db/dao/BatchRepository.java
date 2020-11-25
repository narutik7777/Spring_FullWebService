package Ilyas.db.dao;

import Ilyas.db.model.Batch;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Pavel
 */
public interface BatchRepository extends CrudRepository<Batch, Integer> {

     List<Batch> findBySchool(Integer school);
}
