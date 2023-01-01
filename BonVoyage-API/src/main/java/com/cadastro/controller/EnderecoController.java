package com.cadastro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.model.Endereco;
import com.cadastro.serviceImpl.EnderecoServiceImpl;

@RestController
@CrossOrigin("*")
@RequestMapping("endereco")
public class EnderecoController {
	
	@Autowired
	private EnderecoServiceImpl service;
	
	@GetMapping("{id_endereco}")
	public ResponseEntity<Endereco> getEnderecoById(@PathVariable("id_endereco") long idendereco) {
		return new ResponseEntity<Endereco>(service.getEnderecoById(idendereco), HttpStatus.OK);
				
	}
	
	@GetMapping
	public ResponseEntity<List<Endereco>> findAll() {
		List<Endereco> endereco = service.getAllEndereco();
		return ResponseEntity.ok().body(endereco);
	}
	
	@PostMapping
	public ResponseEntity<Endereco> saveEndereco(@RequestBody Endereco endereco) {
		return new ResponseEntity<Endereco>(service.saveEndereco(endereco), HttpStatus.CREATED);
	}
	
	@PutMapping("{id_endereco}")
	public ResponseEntity<Endereco> updateEndereco(@PathVariable("id_endereco") long id_endereco,
			@RequestBody Endereco endereco) {
		return new ResponseEntity<Endereco>(service.updateEndereco(endereco, id_endereco), HttpStatus.OK);
	}
	
	@DeleteMapping("{id_endereco}")
	public ResponseEntity<String> deleteEndereco(@PathVariable("id_endereco") long id_endereco) {
		service.deleteEndereco(id_endereco);
		
		return new ResponseEntity<String>("Endereço deletado com sucesso!", HttpStatus.OK);
	}

}
