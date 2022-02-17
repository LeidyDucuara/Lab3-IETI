package co.edu.escuelaing.ieti.usuario.repository;

import co.edu.escuelaing.ieti.usuario.data.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String>{
}
