package br.org.eureka.Eureka.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.eureka.Eureka.model.Comentario;
import br.org.eureka.Eureka.service.IComentarioService;

@RestController
@CrossOrigin("*")
public class ComentarioController {
	
	@Autowired
	private IComentarioService servico;
	
	@PostMapping("/comentario/novo/")
	public ResponseEntity<Comentario> incluirNovo (@RequestBody Comentario comentario) {
		
		servico.adicionarNovoComentario(comentario);
		return ResponseEntity.ok(comentario);
	}
	
	@GetMapping("/comentario/todos/")
	public ResponseEntity<List<Comentario>> mostrarTodos(){
		return ResponseEntity.ok(servico.recuperarTodos());
	}
	

}
