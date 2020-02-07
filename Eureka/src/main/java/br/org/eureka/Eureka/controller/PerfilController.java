package br.org.eureka.Eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.org.eureka.Eureka.model.PerfilUsuario;
import br.org.eureka.Eureka.service.IPerfilUsuarioService;

@RestController
@CrossOrigin("*")
public class PerfilController {

	@Autowired
	private IPerfilUsuarioService servico;

	@GetMapping("/perfilusuario/{idusuario}")
	public ResponseEntity<PerfilUsuario> mostrarPeloId(@PathVariable int idusuario){
		PerfilUsuario p = servico.recuperarPorId(idusuario);
		if (p != null) {
			return ResponseEntity.ok(p);
		}
		return ResponseEntity.notFound().build();
	}
	
	
}
