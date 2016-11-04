package ravikumar.sujatha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ravikumar.sujatha.domain.User;

/**
 * Created by sujatharavikumar on 11/3/16.
 */

@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername (@Param("username") String username);

}
