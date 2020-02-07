package br.org.eureka.Eureka.service;

import java.util.List;

import br.org.eureka.Eureka.model.CadastroUsuario;

public interface ICadastroUsuarioService  {
	public List<CadastroUsuario> recuperarTodos(); 
	public CadastroUsuario recuperarPorId(int id);
	public void adicionarNovoUsuario (CadastroUsuario cadastro);
	public CadastroUsuario autenticarUsuario(String email, String senha);

}
