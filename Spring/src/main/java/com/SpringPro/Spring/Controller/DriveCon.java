package com.SpringPro.Spring.Controller;

import com.SpringPro.Spring.Entity.Alumini;
import com.SpringPro.Spring.Entity.Drive;
import com.SpringPro.Spring.Service.DriveSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DriveCon {
    @Autowired
    DriveSer ser;
    @GetMapping("/allDrive")
    public String showDrive( Model model) {

        List<Drive> list=ser.getAll();
        model.addAttribute("all",list);
        return "drive";
    }
    @GetMapping("/drive")
    public String getPage(@ModelAttribute("drive") Drive drive)
    {
        return "addDrive";
    }
    @PostMapping("/drive")
    public String saveDrive(@ModelAttribute("drive") Drive drive) {
        ser.saveDrive(drive);
        return "redirect:/adminDrive";
    }
    @GetMapping("/adminDrive")
    public String Drive( Model model) {

        List<Drive> list=ser.getAll();
        model.addAttribute("all",list);
        return "adminDrive";
    }
    @GetMapping("/add1/{id}")
    public String addNew(@ModelAttribute("all") Alumini p, @PathVariable("id") long id, Model model) {
           Drive one=ser.getDrive(id);
           model.addAttribute("product", one);
           return "open";
        }

}
