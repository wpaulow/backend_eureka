package br.org.eureka.Eureka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.org.eureka.Eureka.model.CadastroUsuario;
import br.org.eureka.Eureka.security.Autenticator;
import br.org.eureka.Eureka.security.Token;
import br.org.eureka.Eureka.service.ICadastroUsuarioService;

@RestController
@CrossOrigin("*")
public class CadastroController {

	@Autowired
	private ICadastroUsuarioService servico;

	@PostMapping("/login/")
	public ResponseEntity<Token> autentica(@RequestBody CadastroUsuario usuario) {
		CadastroUsuario user = servico.autenticarUsuario(usuario.getEmail(), usuario.getSenha());
		if (user != null) {
			Token token = new Token();
			token.setStrToken(Autenticator.generateToken(user));
			return ResponseEntity.ok(token);
		} else {
			return ResponseEntity.status(403).build();
		}

	}

	@PostMapping("/cadastro/novo/")
	public ResponseEntity<CadastroUsuario> incluirNovo(@RequestBody CadastroUsuario cadastro) {
		System.out.println(cadastro.getNome());
		servico.adicionarNovoUsuario(cadastro);
		System.out.println(cadastro.getNome());
		return ResponseEntity.ok(cadastro);
	}

	@GetMapping("/cadastro/todos/")
	public ResponseEntity<List<CadastroUsuario>> mostrarTodos() {
		return ResponseEntity.ok(servico.recuperarTodos());
	}

	@GetMapping("/cadastro/{idUsuario}")
	public ResponseEntity<CadastroUsuario> mostrarPeloId(@PathVariable int idusuario) {
		CadastroUsuario c = servico.recuperarPorId(idusuario);
		if (c != null) {
			return ResponseEntity.ok(c);
		}
		return ResponseEntity.notFound().build();
	}

	@PostMapping("/cadastro/login")
	public ResponseEntity<CadastroUsuario> logarUsuario(@RequestBody CadastroUsuario usuario) {
		CadastroUsuario u = servico.autenticarUsuario(usuario.getEmail(), usuario.getSenha());
		if (u != null) {
			return ResponseEntity.ok(u);
		}
		return ResponseEntity.notFound().build();
	}

	@GetMapping("/Feed")
	public ResponseEntity<CadastroUsuario> getInfo(@RequestParam String token) {
		CadastroUsuario tmp = Autenticator.getUserFromToken(token);
		tmp = servico.recuperarPorId(tmp.getIdUsuario());
		if (tmp != null) {
			return ResponseEntity.ok(tmp);
		}
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping("/cadastro/detalhes")
	public ResponseEntity<CadastroUsuario> getDetalhes(@RequestParam String token){
		CadastroUsuario user = Autenticator.getUserFromToken(token);
		user = servico.recuperarPorId(user.getIdUsuario());
		return ResponseEntity.ok(user);
	}
}
