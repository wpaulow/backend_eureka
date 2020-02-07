package br.org.eureka.Eureka.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.eureka.Eureka.model.PerfilUsuario;


public interface IPerfilUsuarioRepo extends CrudRepository<PerfilUsuario, Integer> {
	
}
