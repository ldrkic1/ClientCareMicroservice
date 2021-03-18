package ba.unsa.etf.clientcaremicroservice.Repository;

import ba.unsa.etf.clientcaremicroservice.Model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
