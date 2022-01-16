package com.jaz.JazProject.Services;

import com.jaz.JazProject.entities.Admin;
import com.jaz.JazProject.repository.AdminRepo;
import com.jaz.JazProject.security.AdminPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class AdminDetailsService implements UserDetailsService {

    private AdminRepo repo;

    @Autowired
    public AdminDetailsService(AdminRepo repo) {
        this.repo = repo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Admin admin = repo.findByUsername(username);
        if(admin == null){
            throw new UsernameNotFoundException("Admin 404");
        }

        return new AdminPrincipal(admin);
    }
}
