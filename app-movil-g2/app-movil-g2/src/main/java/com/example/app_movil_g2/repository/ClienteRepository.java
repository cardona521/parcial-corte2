package com.example.app_movil_g2.repository;

import com.example.app_movil_g2.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}
