package com.SpringPro.Spring.Service;

import com.SpringPro.Spring.Entity.Login;
import com.SpringPro.Spring.Repository.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginSer {
    @Autowired
    LoginRepo repo;

    public Login checkUser(String email)
    {
        Login login= repo.findByEmail(email);
        return login;
    }
    public void saveUser(Login login)
    {
        repo.save(login);
    }
    public boolean checkEmail(String email)
    {
        return repo.existsByEmail(email);
    }



}
