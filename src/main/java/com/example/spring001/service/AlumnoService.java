/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.spring001.service;

import com.example.spring001.entity.Alumno;
import java.util.List;

/**
 *
 * @author admin
 */
public interface AlumnoService {
    int create(Alumno alum);
    int update(Alumno alum);
    int delete(int id);
    Alumno read(int id);
    List<Alumno> readAll();
}
