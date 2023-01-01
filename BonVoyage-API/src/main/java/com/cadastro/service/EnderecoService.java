package com.cadastro.service;

import java.util.List;

import com.cadastro.model.Endereco;

public interface EnderecoService {
	Endereco saveEndereco(Endereco endereco);
	List<Endereco> getAllEndereco();
	Endereco getEnderecoById(long id_enderco);
	Endereco updateEndereco(Endereco endereco, long id_endereco);
	void deleteEndereco(long id_endereco);
}
