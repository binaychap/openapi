package com.openapi.openapi.repository

import com.openapi.openapi.domain.User
import org.springframework.stereotype.Component

/**
 * Created by binai_rai on 12/10/17.
 */

@Component
class UserRepository {


    private static List<User> users = new ArrayList<>()

    private static int usersCount = 3

    static {
        users.add(new User(1, "Adam", new Date()))
        users.add(new User(2, "Eve", new Date()))
        users.add(new User(3, "Jack", new Date()))
    }

     List<User> findAll() {
        return users
    }

     User save(User user) {
        if (user.getId() == null) {
            user.setId(++usersCount)
        }
        users.add(user)
        return user
    }

     User findOne(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user
            }
        }
        return null
    }
}
