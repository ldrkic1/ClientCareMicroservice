package ba.unsa.etf.clientcaremicroservice.Controller;

import ba.unsa.etf.clientcaremicroservice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserController {
    @Autowired
    private UserService userService;
}
