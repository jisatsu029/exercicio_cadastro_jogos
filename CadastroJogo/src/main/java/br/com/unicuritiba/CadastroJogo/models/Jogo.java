package br.com.unicuritiba.CadastroJogo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tabela_jogo")

public class Jogo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "genero")
	private String genero;
	
	@Column(name = "data_de_lancamento")
	private String data_de_lancamento;
	
	@Column(name = "classificacao_indicativa")
	private String classificacao_indicativa;
	
	@Column(name = "empresa")
	private String empresa;
	
	@Column(name = "preco")
	private String preco;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getData_de_lancamento() {
		return data_de_lancamento;
	}

	public void setData_de_lancamento(String data_de_lancamento) {
		this.data_de_lancamento = data_de_lancamento;
	}

	public String getClassificacao_indicativa() {
		return classificacao_indicativa;
	}

	public void setClassificacao_indicativa(String classificacao_indicativa) {
		this.classificacao_indicativa = classificacao_indicativa;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getModo_de_jogo() {
		return modo_de_jogo;
	}

	public void setModo_de_jogo(String modo_de_jogo) {
		this.modo_de_jogo = modo_de_jogo;
	}

	@Column(name = "modo_de_jogo")
	private String modo_de_jogo;
	
}
