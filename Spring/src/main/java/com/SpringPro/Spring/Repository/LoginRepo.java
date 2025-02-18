package com.SpringPro.Spring.Repository;

import com.SpringPro.Spring.Entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepo extends JpaRepository<Login,Long> {
    Login findByEmail(String email);
    boolean existsByEmail(String email);

}
