package com.cadastro.service;

import java.util.List;

import com.cadastro.model.Usuarios;

public interface UsuarioService {
	Usuarios saveUsuarios(Usuarios usuario);
	List<Usuarios> getAllUsuarios();
	Usuarios getUsuariosById(long id);
	Usuarios updateUsuarios(Usuarios usuario, long id);
	void deleteUsuarios(long id);
}

