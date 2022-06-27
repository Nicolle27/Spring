
package com.example.spring001.dao;

import com.example.spring001.entity.Alumno;
import java.util.List;

/**
 *
 * @author admin
 */
public interface AlumnoDao {
    int create(Alumno alum);
    int update(Alumno alum);
    int delete(int id);
    Alumno read(int id);
    List<Alumno> readAll();
}
