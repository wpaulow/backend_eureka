package br.org.eureka.Eureka.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity 
@Table(name = "tbl_cadastrousuario", uniqueConstraints={@UniqueConstraint(columnNames={"email"})})
public class CadastroUsuario {
 
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "idUsuario")
	private int idUsuario;

	@Column(name="email", length = 150)
	private String email;  
	
	@Column (name= "nome", length = 150)
	private String nome; 

	@Column (name = "senha", length = 200)
	private String senha; 
	
	@Column (name="telefone", length = 20)
    private String telefone;
	
	
	@Column (name="foto", length = 400 )
	private String foto; 
	
	@Column (name= "descricao", length = 600)
	private String descricao;

	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cadastro")
	@JsonIgnoreProperties("cadastro")
	private List<Postagem> postagem;
	
	
	public void setIdusuario(int idusuario) {
		this.idUsuario = idusuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
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

	
	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}
	
	@Override
	public String toString() {
		//return idUsuario+";"+nome+";"+email;
		return idUsuario+";"+nome+";"+email+";"+senha+";"+telefone+";"+foto+";"+descricao+";"+postagem;
		/*return "CadastroUsuario [idUsuario=" + idUsuario + ", email=" + email + ", nome=" + nome + ", senha=" + senha
				+ ", telefone=" + telefone + ", foto=" + foto + ", descricao=" + descricao + ", postagem=" + postagem
				+ "]";*/
	}

	
}
