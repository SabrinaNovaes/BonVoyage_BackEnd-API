package com.cadastro.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.exception.ResourceNotFoundException;
import com.cadastro.model.Usuarios;
import com.cadastro.repositories.UsuarioRepository;
import com.cadastro.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public Usuarios saveUsuarios(Usuarios usuarios) {
		return usuarioRepository.save(usuarios);
	}
	
	@Override
	public List<Usuarios> getAllUsuarios() {
		return usuarioRepository.findAll();
	}
	
	@Override
	public Usuarios getUsuariosById(long id_usuario) {
		return usuarioRepository.findById(id_usuario).orElseThrow(() ->
				new ResourceNotFoundException("Usuário", "id", id_usuario));
	}
	
	@Override
	public Usuarios updateUsuarios(Usuarios usuarios, long id_usuario) {
		
		Usuarios usuarioExistente = usuarioRepository.findById(id_usuario).orElseThrow(() ->
				new ResourceNotFoundException("Usuario", "id", id_usuario));
		
		usuarioExistente.setNome_usuario(usuarios.getNome_usuario());
		usuarioExistente.setEmail(usuarios.getEmail());
		usuarioExistente.setSenha(usuarios.getSenha());
		
		usuarioRepository.save(usuarioExistente);
		return usuarioExistente;
	}
	
	@Override
	public void deleteUsuarios(long id_usuario) {
		usuarioRepository.findById(id_usuario).orElseThrow(() ->
				new ResourceNotFoundException("Usuarios", "id", id_usuario));
	}
	
}

