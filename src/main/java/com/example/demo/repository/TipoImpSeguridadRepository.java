package com.example.demo.repository;

import com.example.demo.models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoImpSeguridadRepository extends JpaRepository<TipoImpSeguridad, Integer> {
}