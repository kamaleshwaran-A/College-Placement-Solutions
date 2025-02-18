package com.SpringPro.Spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringPro.Spring.Entity.Recu;

@Repository
public interface RecuRepo extends JpaRepository<Recu,Long> {
    Recu findByName(String name);
}
