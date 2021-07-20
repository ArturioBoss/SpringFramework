package com.arturios.site.project.repositories;

import com.arturios.site.project.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findOneByUserName(String userName);
}
