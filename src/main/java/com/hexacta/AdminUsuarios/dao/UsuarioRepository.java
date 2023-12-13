package com.hexacta.AdminUsuarios.dao;

import com.hexacta.AdminUsuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface UsuarioRepository extends JpaRepository<Usuario, Id> {}
