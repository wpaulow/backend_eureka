package br.org.eureka.Eureka.service;

import java.util.List;

import br.org.eureka.Eureka.model.PerfilUsuario;

public interface IPerfilUsuarioService {
	public List<PerfilUsuario> recuperarTodos();
	public PerfilUsuario recuperarPorId(int id);
}
