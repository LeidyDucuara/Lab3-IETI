package co.edu.escuelaing.ieti.usuario.repository;

import co.edu.escuelaing.ieti.usuario.data.User;
import co.edu.escuelaing.ieti.usuario.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceMongoDB implements UserService {

    private final UserRepository userRepository;

    public UserServiceMongoDB(@Autowired UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public User update(User userDto, String userId) {
        return null;
    }
}
