package ba.unsa.etf.clientcaremicroservice.Repository;

import ba.unsa.etf.clientcaremicroservice.Model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
