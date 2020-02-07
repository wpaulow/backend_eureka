package br.org.eureka.Eureka.service;

import java.util.List;

import br.org.eureka.Eureka.model.Comentario;

public interface IComentarioService {
	public List<Comentario> recuperarTodos();
	public Comentario recuperarPorId(int id);
	public void adicionarNovoComentario (Comentario comentario);
}
