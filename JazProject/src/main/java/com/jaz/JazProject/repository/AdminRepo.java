package com.jaz.JazProject.repository;

import com.jaz.JazProject.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin,Long>{
    Admin findByUsername(String username);
}
