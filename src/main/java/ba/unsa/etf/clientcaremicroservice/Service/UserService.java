package ba.unsa.etf.clientcaremicroservice.Service;

import ba.unsa.etf.clientcaremicroservice.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    private UserRepository userRepository;
}
