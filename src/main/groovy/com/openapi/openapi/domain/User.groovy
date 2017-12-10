package com.openapi.openapi.domain

/**
 * Created by binai_rai on 12/10/17.
 */
class User {

    Integer id
    String name
    Date birthDate

    User() {}

    User(Integer id, String name, Date birthDate) {
        this.id = id
        this.name = name
        this.birthDate = birthDate
    }

    @Override
    String toString() {
        return String.format("User [id=%s, name=%s, birthDate=%s]", id, name, birthDate);
    }

}
