package br.org.eureka.Eureka.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.org.eureka.Eureka.model.Postagem;


public interface IPostagemRepo extends CrudRepository<Postagem, Integer> {
	
	public List<Postagem> findByOrderByIdPostagemDesc();

}
