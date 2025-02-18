package com.SpringPro.Spring.Repository;

import com.SpringPro.Spring.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin,Long> {
    Admin findByEmail(String email);
}
