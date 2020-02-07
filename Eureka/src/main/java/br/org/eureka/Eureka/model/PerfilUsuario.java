package br.org.eureka.Eureka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tbl_perfilusuario")
public class PerfilUsuario {
	
	@Id
	@Column(name = "idusuario")
	private int idusuario;
	
	@Column (name="foto", length = 400 )
	private String foto; 
	
	@Column (name= "descricao", length = 600)
	private String descricao;
	

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
