
package com.example.spring001.controller;

import com.example.spring001.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author admin
 */
@Controller
@RequestMapping("/alumno")
public class AlumnoController {
    @Autowired
    private AlumnoService alumnoService;
    
    @GetMapping
    public String listarAlumno(Model model){
        model.addAttribute("alumnos", alumnoService.readAll());
        return "/alumno/listarAlumno";
    } 
}
