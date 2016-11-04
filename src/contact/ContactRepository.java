package contact;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by test1 on 04.11.16.
 */
public interface ContactRepository extends CrudRepository <Contact, Long> {
}
