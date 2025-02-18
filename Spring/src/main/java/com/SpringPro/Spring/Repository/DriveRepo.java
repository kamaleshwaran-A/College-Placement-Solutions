package com.SpringPro.Spring.Repository;

import com.SpringPro.Spring.Entity.Drive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriveRepo extends JpaRepository<Drive,Long> {
}
