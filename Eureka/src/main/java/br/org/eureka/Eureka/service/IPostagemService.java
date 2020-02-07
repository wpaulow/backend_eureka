package br.org.eureka.Eureka.service;

import java.util.List;


import br.org.eureka.Eureka.model.Postagem;



public interface IPostagemService {
	public List<Postagem> recuperarTodos();
	public Postagem recuperarPorId(int id);
	public void adicionarNovaPostagem (Postagem post);
	public void deletarPost(Postagem post);
}
