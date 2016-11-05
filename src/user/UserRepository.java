package user;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by test1 on 06.11.16.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
