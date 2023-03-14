package com.eam.crud.crudspringboot.repositorie;
import com.eam.crud.crudspringboot.models.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepositorio extends JpaRepository <Estudiante,Long>{
    
}
