package com.example.Biblioteca.repository;

import com.example.Biblioteca.model.LibroModel;
import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {

    private List<LibroModel> listalibros = new ArrayList<>();

    @PostConstruct
    public void init(){
        listalibros.add(new LibroModel(2,"97823-23232","Spring in action","emma watson",2018,"a"));
        
    }




}
