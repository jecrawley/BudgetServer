package ravikumar.sujatha.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.*;
import ravikumar.sujatha.domain.User;
import ravikumar.sujatha.repository.UserRepository;

/**
 * Created by sujatharavikumar on 11/3/16.
 */

@RestController
@CrossOrigin(origins = "http://localhost:8100")
public class UserController {

    @Autowired
    private UserRepository repo;

    public UserRepository getRepo () {
        return repo;
    }


    @RequestMapping(value = "/createuser", method = RequestMethod.POST)
    public String createUser (@RequestBody User user) {
        try {
            repo.saveAndFlush(user);
        } catch (DataIntegrityViolationException e) {
            return "{\"message\": \"Error! User already exists.\"}";
        }
        return "{\"message\":\"Success!\"}";
    }

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public String authenticateUser (@RequestBody User user) {
        User userToValidate = repo.findByUsername(user.getUsername());
        if (userToValidate != null && userToValidate.getPassword().equals(user.getPassword())) {
            return "{\"message\":\"Success!\"}";
        } else {
            return "{\"message\": \"Error! Inccorect credentials.\"}";
        }

    }
}
