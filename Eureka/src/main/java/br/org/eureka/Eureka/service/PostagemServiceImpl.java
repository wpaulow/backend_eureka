package br.org.eureka.Eureka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import br.org.eureka.Eureka.dao.IPostagemRepo;
import br.org.eureka.Eureka.model.Postagem;

@Component
public class PostagemServiceImpl implements IPostagemService {

	@Autowired
	private IPostagemRepo repo;
	
	@Override
	public List<Postagem> recuperarTodos() {
		// TODO Auto-generated method stub
		return (List<Postagem>)repo.findByOrderByIdPostagemDesc();
	}

	@Override
	public Postagem recuperarPorId(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void adicionarNovaPostagem(Postagem post) {
			
		repo.save(post);
	}

	@Override
	public void deletarPost(Postagem post) {
		
		repo.delete(post);	
	}
	
	
}
