package br.org.eureka.Eureka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.eureka.Eureka.dao.IComentarioRepo;
import br.org.eureka.Eureka.model.Comentario;

@Component
public class ComentarioServiceImpl implements IComentarioService{

	@Autowired
	private IComentarioRepo repo;
	
	@Override
	public List<Comentario> recuperarTodos() {
		
		return (List<Comentario>)repo.findAll();
	}

	@Override
	public Comentario recuperarPorId(int id) {
		
		return repo.findById(id).get();
	}

	@Override
	public void adicionarNovoComentario(Comentario comentario) {
		
		repo.save(comentario);
	}

}
