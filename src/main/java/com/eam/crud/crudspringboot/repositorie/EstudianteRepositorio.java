package com.eam.crud.crudspringboot.repositorie;
import com.eam.crud.crudspringboot.models.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepositorio extends JpaRepository <Estudiante,Long>{
    
}
