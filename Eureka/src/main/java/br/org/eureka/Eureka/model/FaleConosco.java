package br.org.eureka.Eureka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_faleConosco")
public class FaleConosco {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idFaleConosco")
	private int idFaleConosco;
	
	@Column(name = "nome", length = 150)
	private String nome;
	
	@Column(name = "telefone", length = 20)
	private String telefone;
	
	@Column(name = "msg", length = 2500)
	private String msg;

	@Column(name = "email", length = 100)
	private String email;


	public int getIdFaleConosco() {
		return idFaleConosco;
	}

	public void setIdFaleConosco(int idFaleConosco) {
		this.idFaleConosco = idFaleConosco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	
	
	
}
