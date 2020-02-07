package br.org.eureka.Eureka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tblcomentario")

public class Comentario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcomentario")
	private int idComentario;


	@Column(name = "mensagem")
	private String mensagem;
	
	@ManyToOne
	@JsonIgnoreProperties("comentario")
	private Postagem postagem;
	
	@ManyToOne
	@JsonIgnoreProperties("perfilUsuario")
	private PerfilUsuario perfilUsuario;


	public int getIdComentario() {
		return idComentario;
	}


	public void setIdComentario(int idComentario) {
		this.idComentario = idComentario;
	}


	public String getMensagem() {
		return mensagem;
	}


	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}


	public Postagem getPostagem() {
		return postagem;
	}


	public void setPostagem(Postagem postagem) {
		this.postagem = postagem;
	}


	public PerfilUsuario getPerfilUsuario() {
		return perfilUsuario;
	}


	public void setPerfilUsuario(PerfilUsuario perfilUsuario) {
		this.perfilUsuario = perfilUsuario;
	}

	
	
}
