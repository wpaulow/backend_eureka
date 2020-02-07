package br.org.eureka.Eureka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.eureka.Eureka.dao.IPerfilUsuarioRepo;
import br.org.eureka.Eureka.model.PerfilUsuario;

@Component
public class PerfilUsuarioServiceImpl implements IPerfilUsuarioService{
	
	@Autowired
	private IPerfilUsuarioRepo repo;
	
	@Override
	public List<PerfilUsuario> recuperarTodos() {
		// TODO Auto-generated method stub
		return (List<PerfilUsuario>)repo.findAll();
	}

	@Override
	public PerfilUsuario recuperarPorId(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}
}
