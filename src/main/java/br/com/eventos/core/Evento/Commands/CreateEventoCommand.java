package br.com.eventos.core.Evento.Commands;

import java.util.Date;

import br.com.eventos.domain.Categoria;
import br.com.eventos.domain.Evento;

public class CreateEventoCommand {
	private int idEndereco;
	private String nome;
	private Date  data;
	private String descricao;
	private Categoria categoria;
	
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
	
	public Evento converter() {		
		return new Evento(idEndereco,nome, data, descricao, categoria);
	}
}
