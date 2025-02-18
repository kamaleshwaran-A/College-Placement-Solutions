package com.SpringPro.Spring.Service;

// import com.SpringPro.Spring.Entity.Alumini;
import com.SpringPro.Spring.Entity.Recu;
import com.SpringPro.Spring.Repository.RecuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecuSer {
    @Autowired
    RecuRepo repo;
    public void saveProduct(Recu pro) {
        repo.save(pro);
    }
    public List<Recu> getAll(){
        return repo.findAll();
    }
    public void delete(long id)
    {
        repo.deleteById(id);
    }
    public Recu getAll(String name)
    {
        return repo.findByName(name);
    }
}
