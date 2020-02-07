package br.org.eureka.Eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.eureka.Eureka.model.FaleConosco;
import br.org.eureka.Eureka.service.IFaleConoscoService;

@RestController
@CrossOrigin("*")
public class FaleConoscoController {
	
	@Autowired
	private IFaleConoscoService servico;
	
	@PostMapping("/faleconosco/novo/")
	public ResponseEntity<FaleConosco> incluirNovo (@RequestBody FaleConosco faq) {
		
		servico.adicionarNovoFAQ(faq);
		return ResponseEntity.ok(faq);
	}
}
