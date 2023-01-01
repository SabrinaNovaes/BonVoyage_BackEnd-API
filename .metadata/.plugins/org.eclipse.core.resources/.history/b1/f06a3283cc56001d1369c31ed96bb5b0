package com.cadastro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "usuarios")
public class Usuarios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_usuario;
	
	@Column(name = "nome_usuario", nullable = false)
	private String nome_usuario;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "senha", nullable = false)
	private String senha;
	

	@Override
	public String toString() {
		return "Usuários [id: " + id_usuario + "Nome usuario: " + nome_usuario
					+ "Email: " + email + "Senha: " + senha + "]";
	}
	
}