/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.spring001.daoImpl;

import com.example.spring001.dao.AlumnoDao;
import com.example.spring001.entity.Alumno;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author admin
 */
@Repository
public class AlumnoDaoImpl implements AlumnoDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public int create(Alumno alum) {
        String SQL = "INSERT into alumno(nombres,apellidos,telefono,correo) VALUES(?,?,?,?)";
        return jdbcTemplate.update(SQL, alum.getNombres(), alum.getApellidos(), alum.getTelefono(), alum.getCorreo());
    }

    @Override
    public int update(Alumno alum) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Alumno read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Alumno> readAll() {
        String SQL = "SELECT *FROM alumno";        
        return jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Alumno.class));
    }
    
}
