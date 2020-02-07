package br.org.eureka.Eureka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.eureka.Eureka.dao.ICadastroUsuarioRepo;
import br.org.eureka.Eureka.model.CadastroUsuario;


@Component
public class CadastroServiceImpl implements ICadastroUsuarioService {

	@Autowired
	private ICadastroUsuarioRepo repo;

	@Override
	public List<CadastroUsuario> recuperarTodos() {
		
		return (List<CadastroUsuario>)repo.findAll();
	}

	@Override
	public CadastroUsuario recuperarPorId(int id) {
		
		return repo.findById(id).get();
	}

	@Override
	public void adicionarNovoUsuario(CadastroUsuario cadastro) {
		repo.save(cadastro);
	}

	
	@Override
	public CadastroUsuario autenticarUsuario(String email, String senha) {
		// TODO Auto-generated method stub
		return repo.findByEmailAndSenha(email, senha);
	}
	
}
