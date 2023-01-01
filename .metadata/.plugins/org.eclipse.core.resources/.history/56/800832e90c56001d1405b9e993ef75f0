package com.cadastro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.model.Usuarios;
import com.cadastro.serviceImpl.UsuarioServiceImpl;

@RestController
@RequestMapping("usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioServiceImpl service;

	@GetMapping("{id_usuario}")
	public ResponseEntity<Usuarios> getUsuariosById(@PathVariable("id_usuario") long usuarioid_usuario ) {
		return new ResponseEntity<Usuarios>(service.getUsuariosById(usuarioid_usuario), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Usuarios>> findAll() {
		List<Usuarios> usuarios = service.getAllUsuarios();
		return ResponseEntity.ok().body(usuarios);
	}
	
	@PostMapping 
	public ResponseEntity<Usuarios> saveUsuarios(@RequestBody Usuarios usuario){
		return new ResponseEntity<Usuarios>(service.saveUsuarios(usuario), HttpStatus.CREATED);
	}
	
	@PutMapping("{id_usuario}")
	public ResponseEntity<Usuarios> updateUsuarios(@PathVariable("id_usuario") long id_usuario,
			@RequestBody Usuarios usuario) {
		return new ResponseEntity<Usuarios>(service.updateUsuarios(usuario, id_usuario), HttpStatus.OK);
	}
	
	@DeleteMapping("{id_usuario}")
	public ResponseEntity<String> deleteUsuarios(@PathVariable("id_usuario") long id_usuario) {
		service.deleteUsuarios(id_usuario);
	
	return new ResponseEntity<String>("Usuário deletado com sucesso!",
			HttpStatus.OK);
	}
}
