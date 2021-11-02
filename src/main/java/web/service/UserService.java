package web.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import web.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> getAllUsers();
    User getUser(Long id);
    void addUser(User user);
    void update(User user);
    void delete(Long id);
    User findByUsername(String username);
}
