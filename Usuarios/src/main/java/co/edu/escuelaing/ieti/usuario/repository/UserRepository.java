package co.edu.escuelaing.ieti.usuario.repository;

import co.edu.escuelaing.ieti.usuario.data.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Date;
import java.util.List;

public interface UserRepository extends MongoRepository<User, String>{

    @Query("select u from User u where u.name like ?1 or u.lastName like ?1")
    List<User> findUsersWithNameOrLastNameLike(String queryText);

    @Query("select u from User u where u.createdAt > ?1")
    List<User> findUsersCreatedAfter(Date startDate);
}
