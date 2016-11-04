package ravikumar.sujatha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import ravikumar.sujatha.domain.User;

import java.util.List;

/**
 * Created by sujatharavikumar on 11/3/16.
 */

@Transactional
@RepositoryRestResource(collectionResourceRel = "user", path = "users")
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername (@Param("username") String username);

}
