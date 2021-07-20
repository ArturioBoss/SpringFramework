package com.arturios.site.project.services;

import com.arturios.site.project.entities.SystemUser;
import com.arturios.site.project.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findByUserName(String userName);
    void save(SystemUser systemUser);
}
