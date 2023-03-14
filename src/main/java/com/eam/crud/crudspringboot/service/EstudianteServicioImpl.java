package com.eam.crud.crudspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eam.crud.crudspringboot.models.Estudiante;
import com.eam.crud.crudspringboot.repositorie.EstudianteRepositorio;


@Service
public class EstudianteServicioImpl implements EstudianteServicio{
    
    @Autowired
    private EstudianteRepositorio repositorio;

    @Override
    public List<Estudiante> listarTodosLosEstudiantes() {
        return repositorio.findAll();
    }

}
