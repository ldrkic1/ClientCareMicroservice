package ba.unsa.etf.clientcaremicroservice.Repository;

import ba.unsa.etf.clientcaremicroservice.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
