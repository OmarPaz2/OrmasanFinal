package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.*;

public interface UsuariosRepository extends JpaRepository<Usuario, Integer>{

    Optional<Usuario> findByCorreoAndContraseña(String correo, String contraseña);
}
