package br.org.eureka.Eureka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.eureka.Eureka.model.Postagem;
import br.org.eureka.Eureka.service.IPostagemService;

@RestController
@CrossOrigin("*")
public class PostagemController {
	
	@Autowired
	private IPostagemService servico;
	
	@GetMapping("/postagem/{idPostagem}")
	public ResponseEntity<Postagem> mostrarPeloId(@PathVariable int idPostagem){
		Postagem p = servico.recuperarPorId(idPostagem);
		if (p != null) {
			return ResponseEntity.ok(p);
		}
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping("/postagem/todos/")
	public ResponseEntity<List<Postagem>> mostrarTodos(){
		return ResponseEntity.ok(servico.recuperarTodos());
	}
	
	@PostMapping("/postagem/novo/")
	public ResponseEntity<Postagem> incluirNovo (@RequestBody Postagem post) {
		
		servico.adicionarNovaPostagem(post);
		return ResponseEntity.ok(post);
	}
	
	@DeleteMapping("/postagem/{idPostagem}")
	public ResponseEntity<Postagem> deletar(@PathVariable Postagem post) {
		
		servico.deletarPost(post);
		return ResponseEntity.ok().build();

	}
	
	
}
