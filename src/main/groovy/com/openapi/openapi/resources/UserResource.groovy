package com.openapi.openapi.resources

import com.openapi.openapi.domain.User
import com.openapi.openapi.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

/**
 * Created by binai_rai on 12/10/17.
 */
@RestController
class UserResource {

    @Autowired
    private UserRepository service


    @GetMapping("/users")
    List<User> retrieveAllUsers() {
        return service.findAll()
    }

    @GetMapping("/users/{id}")
    User retrieveUser(@PathVariable int id) {
        return service.findOne(id)
    }

    //
    // input - details of user
    // output - CREATED & Return the created URI
    @PostMapping("/users")
    void createUser(@RequestBody User user){
        User savedUser = service.save(user)
    }
}
