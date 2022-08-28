package br.com.eventos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.eventos.domain.Evento;
import br.com.eventos.repository.EventoRepository;

@RestController
@RequestMapping("/eventos")
public class EventoController {
	
	@Autowired
	private EventoRepository eventoRepository;
	
	@GetMapping
	public List<Evento> ListaEventos() {
		
		return eventoRepository.findAll();
	}
	
	@PostMapping
	public boolean CreateEvento(Evento evento) {
		
		eventoRepository.save(evento);
		
		return true;
	}
}
