package Ilyas.db.dao;

import Ilyas.db.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository
        extends CrudRepository<User, Integer> {

    User findByLogin(String login);

}
