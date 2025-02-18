package com.SpringPro.Spring.Controller;

// import com.SpringPro.Spring.Entity.Alumini;
// import com.SpringPro.Spring.Entity.Drive;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringPro.Spring.Entity.Recu;
import com.SpringPro.Spring.Service.RecuSer;

@Controller
public class RecuCon {
    @Autowired
    RecuSer ser;
    @GetMapping("/student")
    public String getAllPro(Model model) {
        List<Recu> list = ser.getAll();
        model.addAttribute("product", list);
        return "recu";
    }
    @GetMapping("/delete/{id}")
    public String deletePro(@PathVariable("id")long id)
    {
        ser.delete(id);
        return "redirect:/student";
    }
    @GetMapping("/product")
    public String getproductPage(@ModelAttribute("product") Recu pro)
    {
        return "stuadd";
    }

    @PostMapping("/product")
    public String saveProduct(@ModelAttribute("product") Recu pro, Model model) {
        ser.saveProduct(pro);
        return "redirect:/allDrive";
    }
    @GetMapping("/search")
    public String searchStu(@RequestParam String name, Model model) {
        Recu list=ser.getAll(name);
        if(Objects.nonNull(list)) {

            model.addAttribute("pro", list);
            return "result";
        }
        else{
            model.addAttribute("pro", list);
            return "noteli";
        }
    }
}
