package com.SpringPro.Spring.Service;

import com.SpringPro.Spring.Entity.Admin;
// import com.SpringPro.Spring.Entity.Login;
import com.SpringPro.Spring.Repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AmindSer
{
    @Autowired
    AdminRepo repo;
    public Admin checkUser(String email)
    {
        Admin login= repo.findByEmail(email);
        return login;
    }
}
