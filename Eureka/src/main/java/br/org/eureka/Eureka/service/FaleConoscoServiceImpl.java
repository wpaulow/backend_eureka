package br.org.eureka.Eureka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.eureka.Eureka.dao.IFaleConoscoRepo;
import br.org.eureka.Eureka.model.FaleConosco;

@Component
public class FaleConoscoServiceImpl implements IFaleConoscoService {

	@Autowired
	private IFaleConoscoRepo repo;

	@Override
	public List<FaleConosco> recuperarTodos() {
		
		return(List<FaleConosco>)repo.findAll() ;
	}

	@Override
	public FaleConosco recuperaPorId(int id) {
	
		return repo.findById(id).get();
	}


	@Override
	public void adicionarNovoFAQ(FaleConosco faq) {
		
		repo.save(faq);	
	}

	
	
}
