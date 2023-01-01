package com.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastro.model.Usuarios;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Long> {

}
