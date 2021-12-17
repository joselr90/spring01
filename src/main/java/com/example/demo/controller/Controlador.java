package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controlador {
//    @GetMapping("/index")
//    public String welcome(@RequestParam("name") String name, Model model) {
//        String message= "hola "+name;
//        model.addAttribute("mensaje", message);
//
//        return "index";
//    }

    @GetMapping("/contacto")
    public String contacto(Model model) {
        model.addAttribute("contacto", "Jose Luján Ros");

        return "contacto";
    }
    @GetMapping("/index/{name}/{apellido}")
    public String welcome2(@PathVariable("name") String name, @PathVariable("apellido") String apellido, Model model) {
        String message= "hola "+name+" "+apellido;
        model.addAttribute("mensaje", message);

        return "index";
    }
}
