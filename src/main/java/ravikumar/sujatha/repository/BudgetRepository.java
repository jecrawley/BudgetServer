package ravikumar.sujatha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;
import ravikumar.sujatha.domain.Budget;

/**
 * Created by sujatharavikumar on 11/1/16.
 */
@Transactional
public interface BudgetRepository extends JpaRepository<Budget, Long> {

    Budget findByUsername(@Param("username") String username);
}
