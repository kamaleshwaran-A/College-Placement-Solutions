package com.SpringPro.Spring.Service;

import com.SpringPro.Spring.Entity.Drive;
import com.SpringPro.Spring.Repository.DriveRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriveSer {
    @Autowired
    DriveRepo repo;
    public List<Drive> getAll()
    {
        return repo.findAll();
    }
    public void saveDrive(Drive pro) {
        repo.save(pro);
    }
    public Drive getDrive(long id)
    {
        Optional<Drive> temp=repo.findById(id);
        Drive pro=temp.get();
        return pro;
    }
}
