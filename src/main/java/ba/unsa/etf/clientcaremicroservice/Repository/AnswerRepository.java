package ba.unsa.etf.clientcaremicroservice.Repository;

import ba.unsa.etf.clientcaremicroservice.Model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
