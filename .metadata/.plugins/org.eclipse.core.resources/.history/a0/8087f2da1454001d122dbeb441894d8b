package com.carteira.controller;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carteira.dto.UsuarioDTO;
import com.carteira.exception.ErroAutenticacao;
import com.carteira.exception.RegraNegocioException;
import com.carteira.model.entity.Usuario;
import com.carteira.services.LancamentoService;
import com.carteira.services.UsuarioService;

@RestController
@RequestMapping("api/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService service;
	
	@Autowired
	private LancamentoService lancamentoService;

	/* Exemplo para teste de endpoint */
	@GetMapping("/user")
	public String helloWorld() {
		return "Oi";
	}
	
	@PostMapping("/autenticar")
	public ResponseEntity autenticar(@RequestBody UsuarioDTO dto) { 
		try { 
			Usuario usuarioAutenticado = service.autenticar(dto.getEmail(), dto.getSenha());
			return ResponseEntity.ok(usuarioAutenticado);
		} catch (ErroAutenticacao e){ 
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@PostMapping
	public ResponseEntity salvar(@RequestBody UsuarioDTO dto) { 
		Usuario usuario = Usuario.builder()
				.nome(dto.getNome())
				.email(dto.getEmail())
				.senha(dto.getSenha())
				.build();
		
		try { 
			Usuario usuarioSalvo = service.salvarUsuario(usuario);
			return new ResponseEntity(usuarioSalvo, HttpStatus.CREATED);
		} catch (RegraNegocioException e) { 
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@GetMapping("{id}/saldo")
	public ResponseEntity obterSaldo(@PathVariable Long id) { 
		Optional<Usuario> usuario = service.buscarPorId(id);
		
		if(!usuario.isPresent()) { 
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		
		BigDecimal saldo = lancamentoService.obterSaldoPorUsuario(id);
		return ResponseEntity.ok(saldo);
	}
}
