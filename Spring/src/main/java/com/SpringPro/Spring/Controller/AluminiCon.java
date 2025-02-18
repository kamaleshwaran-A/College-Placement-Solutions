package com.SpringPro.Spring.Controller;

import com.SpringPro.Spring.Entity.Alumini;
// import com.SpringPro.Spring.Entity.Drive;
import com.SpringPro.Spring.Service.AluminiSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AluminiCon {
    @Autowired
    AluminiSer ser;

    @GetMapping("/alumini2")
    public String showAlumini(@RequestParam String name, Model model) {
        List<Alumini> list=ser.getAllUser(name);
        model.addAttribute("all",list);
        return "al1";
    }
    @GetMapping("/alumini3")
    public String showAlu(@RequestParam String name, Model model) {
        List<Alumini> list=ser.getCompany(name);
        model.addAttribute("all",list);
        return "al1";
    }
    @GetMapping("/alumini1")
    public String show(@RequestParam String name, Model model) {
        List<Alumini> list=ser.getYear(name);
        model.addAttribute("all",list);
        return "al1";
    }
    @GetMapping("/addAlu")
    public String getPage(@ModelAttribute("alumini") Alumini drive)
    {
        return "addAlumini";
    }
    @PostMapping("/addAlu")
    public String saveAlumini(@ModelAttribute("alumini") Alumini drive) {
        ser.saveAlu(drive);
        return "redirect:/allAlumini";
    }
    @GetMapping("/allAlumini")
    public String getAllAlu( Model model) {

        List<Alumini> list=ser.getAll();
        model.addAttribute("all",list);
        return "aluminiAd";
    }
    @GetMapping("/allAlu")
    public String getAll( Model model) {

        List<Alumini> list=ser.getAll();
        model.addAttribute("all",list);
        return "al1";
    }
    @GetMapping("/add/{id}")
    public String addshow(@ModelAttribute("all") Alumini p, @PathVariable("id") long id, Model model) {
        Alumini one=ser.getAlumini(id);
        model.addAttribute("pro", one);
        return "show";
    }
}
