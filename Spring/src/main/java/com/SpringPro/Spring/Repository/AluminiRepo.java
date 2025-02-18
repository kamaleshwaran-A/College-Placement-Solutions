package com.SpringPro.Spring.Repository;

import com.SpringPro.Spring.Entity.Alumini;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AluminiRepo extends JpaRepository<Alumini,Long> {
    List<Alumini> findByName(String name);
    List<Alumini> findByCompany(String company);
    List<Alumini> findByYear(String year);
}
