package com.SpringPro.Spring.Service;

import com.SpringPro.Spring.Entity.Alumini;
// import com.SpringPro.Spring.Entity.Drive;
import com.SpringPro.Spring.Repository.AluminiRepo;
// import org.hibernate.boot.archive.scan.internal.ScanResultImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AluminiSer {
    @Autowired
    AluminiRepo repo;
    public List<Alumini> getAllUser(String name)
    {
        return repo.findByName(name);
    }
    public List<Alumini> getCompany(String company){ return repo.findByCompany(company);}
    public List<Alumini> getYear(String year){return repo.findByYear(year);}
    public void saveAlu(Alumini pro) {
        repo.save(pro);
    }
    public List<Alumini> getAll()
    {
        return repo.findAll();
    }
    public Alumini getAlumini(long id)
    {
        Optional<Alumini> temp=repo.findById(id);
        Alumini pro=temp.get();
        return pro;
    }
}
