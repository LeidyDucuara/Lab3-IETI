package co.edu.escuelaing.ieti.usuario.service;

import co.edu.escuelaing.ieti.usuario.data.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserServiceImpl implements UserService {

    private final HashMap<String, User> hashMapUsers = new HashMap<>();

    @Override
    public User create(User user) {
        return hashMapUsers.put(user.getId(),user);
    }

    @Override
    public User findById(String id) {
        User user = hashMapUsers.get(id);
        return user;
    }

    @Override
    public List<User> getAll() {
        ArrayList<User> users = new ArrayList<User>(hashMapUsers.values());
        return  users;
    }

    @Override
    public boolean deleteById(String id) {
        boolean exis;
        try{
            hashMapUsers.remove(id);
            exis = true;
        }catch (Exception e){
            exis =false;
        }
        return exis;
    }

    @Override
    public User update(User userDto, String userId) {
        return hashMapUsers.put(userId,userDto);
    }
}
