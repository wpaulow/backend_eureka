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
@Table(name = "tbl_postagem")
public class Postagem {
	
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idPostagem")
	private int idPostagem; 

	
	@Column(name = "texto", length = 2000)
	private String texto; 
	
	//@Temporal
	@Column (name= "datainclusao", length = 10) 
	private String datainclusao;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private CadastroUsuario cadastro;
	
	
	
	
	public CadastroUsuario getCadastro() {
		return cadastro;
	}

	public void setCadastro(CadastroUsuario cadastro) {
		this.cadastro = cadastro;
	}

	public int getIdPostagem() {
		return idPostagem;
	}

	public void setIdPostagem(int idPostagem) {
		this.idPostagem = idPostagem;
	}

	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getDatainclusao() {
		return datainclusao;
	}

	public void setDatainclusao(String datainclusao) {
		this.datainclusao = datainclusao;
	}

	
	
}
