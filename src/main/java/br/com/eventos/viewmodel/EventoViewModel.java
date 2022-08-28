package br.com.eventos.viewmodel;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.ManyToOne;

import br.com.eventos.domain.Categoria;
import br.com.eventos.domain.Evento;

public class EventoViewModel {
	private Long id;
	private int idEndereco;
	private String nome;
	private Date  data;
	private String descricao;
	private Categoria categoria;
	
	public EventoViewModel() {
		
	}
	public EventoViewModel(Evento evento) {
		this.id = evento.getId();
		this.idEndereco = evento.getIdEndereco();
		this.nome = evento.getNome();
		this.data = evento.getData();
		this.descricao = evento.getDescricao();
		this.categoria = evento.getCategoria();
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
	
	public static List<EventoViewModel> converter(List<Evento> topicos) {
		return topicos.stream().map(EventoViewModel::new).collect(Collectors.toList());
	}

}
