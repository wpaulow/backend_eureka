package br.org.eureka.Eureka.service;

import java.util.List;

import br.org.eureka.Eureka.model.FaleConosco;

public interface IFaleConoscoService {
	public List<FaleConosco> recuperarTodos(); 
	public FaleConosco recuperaPorId(int id); 
	public void adicionarNovoFAQ (FaleConosco faq);

}
