package co.edu.escuelaing.arep.parte1.controller;

import co.edu.escuelaing.arep.parte1.data.User;
import co.edu.escuelaing.arep.parte1.dto.UserDto;
import co.edu.escuelaing.arep.parte1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final UserService userService;

    public UserController(@Autowired UserService userService ) {
        this.userService = userService;
    }


    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getAll());
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<User> findById( @PathVariable String id ) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.findById(id));
    }


    @PostMapping
    public ResponseEntity<User> create( @RequestBody User userDto ) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.create(userDto));
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<User> update( @RequestBody User userDto, @PathVariable String id ) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.update(userDto,id));
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable String id ) {
        try {
            userService.deleteById(id);
            return  ResponseEntity.status(HttpStatus.OK).body(true);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.ordinal()).body(false);
        }
    }
}
