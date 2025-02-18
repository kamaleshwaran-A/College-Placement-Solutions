package com.SpringPro.Spring.Controller;

import org.springframework.ui.Model;
import com.SpringPro.Spring.Entity.Login;
import com.SpringPro.Spring.Service.LoginSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Objects;

@Controller
public class LoginCon {
    @Autowired
    LoginSer ser;
    @GetMapping("/login")
    public String getSignPage(@ModelAttribute("user")Login login)
    {
        return "login";
    }

    @PostMapping("/login")
    public String checkUser(@ModelAttribute("user") Login login,Model model)
    {
        Login check=ser.checkUser(login.getEmail());
        if(Objects.nonNull(check))
        {
            if(check.getPassword().equals(login.getPassword()))
            {
                return "index";
            } 
            else
            {
                model.addAttribute("message", "Incorrect Password");
                return "login";
            }
        }
        else
        {
            model.addAttribute("message", "Eamil Address not found");
            return "login";
        }

    }
    @GetMapping("/logout")
    public String logout(@ModelAttribute("user")Login login)
    {
        return "login";
    }
    @PostMapping("/logout")
    public String logout(@ModelAttribute("user") Login login,Model model) {
        return "login";
    }

    @GetMapping("/past")
    public String goPast()
    {
        return "past";
    }

    @GetMapping("/home")
    public String goHome()
    {
        return "index";
    }

    @GetMapping("/com")
    public String goCompany()
    {
        return "company";
    }

    @GetMapping("/2024")
    public String go2024()
    {
        return "2024";
    }

    @GetMapping("/2023")
    public String go2023()
    {
        return "2023";
    }

    @GetMapping("/2022")
    public String go2022()
    {
        return "2022";
    }

    @GetMapping("/registration")
    public String getRegPage(@ModelAttribute("add")Login login) {
        return "register";
    }

    @PostMapping("/add")
    public String saveUser(@ModelAttribute("add") Login login,Model model) {
        if(!ser.checkEmail(login.getEmail()))
        {
            ser.saveUser(login);
            model.addAttribute("message", "Please Login...");
            return "home";
        }
        else
        {
            model.addAttribute("message", "Email is already exits");
            return "register";
        }
    }

    @GetMapping("/talk")
    public String gotalk()
    {
        return "talk";
    }
    @GetMapping("/alumini")
    public String goalumini()
    {
        return "alumini";
    }

}
