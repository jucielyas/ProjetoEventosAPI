package br.com.eventos.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Evento {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int idEndereco;
	private String nome;
	private Date  data;
	private String descricao;
	@ManyToOne
	private Categoria categoria;
	
	
	public Evento(int idEndereco, String nome, Date data, String descricao, Categoria categoria) {
		super();
		this.idEndereco = idEndereco;
		this.nome = nome;
		this.data = data;
		this.descricao = descricao;
		this.categoria = categoria;
	}
	
	public Evento() {
		
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public int getIdEndereco() {
		return idEndereco;
	}
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
