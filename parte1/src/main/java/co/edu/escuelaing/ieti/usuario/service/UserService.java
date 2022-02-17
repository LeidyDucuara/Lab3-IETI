package co.edu.escuelaing.arep.parte1.service;

import co.edu.escuelaing.arep.parte1.data.User;
import java.util.List;

public interface UserService {

    User create(User user );

    User findById( String id );

    List<User> getAll();

    void deleteById( String id );

    User update(User userDto, String userId );

}
