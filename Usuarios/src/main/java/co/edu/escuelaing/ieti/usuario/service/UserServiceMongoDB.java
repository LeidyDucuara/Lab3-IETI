package co.edu.escuelaing.ieti.usuario.service;

import co.edu.escuelaing.ieti.usuario.data.User;
import co.edu.escuelaing.ieti.usuario.repository.UserRepository;
import co.edu.escuelaing.ieti.usuario.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceMongoDB implements UserService {

    private final UserRepository userRepository;

    public UserServiceMongoDB(@Autowired UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public boolean deleteById(String id) {
        boolean exis;
        if( userRepository.existsById(id)){
            userRepository.deleteById(id);
            exis = true;
        }else {
            exis = false;
        }
        return exis;
    }

    @Override
    public User update(User userDto, String userId) {
        if(userRepository.existsById(userId)){
            User user = userRepository.findById(userId).get();
            user.update(userDto);
            userRepository.save(user);
            return user;
        }
        return null;
    }

    @Override
    public List<User> findUsersWithNameOrLastNameLike(String queryText) {
        return userRepository.findUsersWithNameOrLastNameLike(queryText);
    }

    @Override
    public List<User> findUsersCreatedAfter(Date startDate) {
        return userRepository.findUsersCreatedAfter(startDate);
    }
}
