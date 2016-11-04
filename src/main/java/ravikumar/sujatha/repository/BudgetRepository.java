package ravikumar.sujatha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import ravikumar.sujatha.domain.Budget;

import java.util.List;

/**
 * Created by sujatharavikumar on 11/1/16.
 */
@Transactional
@RepositoryRestResource(collectionResourceRel = "budget", path = "budgets")
public interface BudgetRepository extends JpaRepository<Budget, Long> {

    List<Budget> findByUsername(@Param("username") String username);
}
