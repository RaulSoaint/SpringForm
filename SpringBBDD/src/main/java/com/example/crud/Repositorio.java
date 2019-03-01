package com.example.crud;

import org.springframework.data.repository.CrudRepository;

import com.example.pojo.Persona;

public interface Repositorio extends CrudRepository<Persona, Integer>{

}
