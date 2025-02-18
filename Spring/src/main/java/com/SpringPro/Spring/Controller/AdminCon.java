package com.SpringPro.Spring.Controller;

import com.SpringPro.Spring.Entity.Admin;
import com.SpringPro.Spring.Service.AmindSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Objects;

@Controller
public class AdminCon {
    @Autowired
    AmindSer ser;
    @GetMapping("/admin")
    public String getRegPage(@ModelAttribute("user") Admin login) {
        return "admin";
    }


    @PostMapping("/admin")
    public String saveUser(@ModelAttribute("user") Admin login, Model model) {
        Admin check=ser.checkUser(login.getEmail());
        if(Objects.nonNull(check))
        {
            if(check.getPassword().equals(login.getPassword()))
            {
                return "home";
            }
            else
            {
                model.addAttribute("message", "Incorrect Password");
                return "admin";
            }
        }
        else
        {
            model.addAttribute("message", "Eamil Address not found");
            return "admin";
        }
    }

    @GetMapping("/adminhome")
    public String gohome()
    {
        return "home";
    }

}
