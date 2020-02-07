package br.org.eureka.Eureka.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.eureka.Eureka.model.CadastroUsuario;

public interface ICadastroUsuarioRepo extends CrudRepository<CadastroUsuario, Integer>{
	 public CadastroUsuario findByEmailAndSenha(String email, String senha);
}
