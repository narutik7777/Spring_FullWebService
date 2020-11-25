package Ilyas.db.dao;

import Ilyas.db.model.School;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Pavel
 */
public interface SchoolRepository extends CrudRepository<School, Integer> {

    // List<School> findByNumber(Integer number);
}
