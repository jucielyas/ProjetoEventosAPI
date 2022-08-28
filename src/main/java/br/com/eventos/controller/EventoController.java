package br.com.eventos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.eventos.core.Evento.Commands.CreateEventoCommand;
import br.com.eventos.domain.Evento;
import br.com.eventos.repository.EventoRepository;
import br.com.eventos.viewmodel.EventoViewModel;

@RestController
@RequestMapping("/eventos")
public class EventoController {
	
	@Autowired
	private EventoRepository eventoRepository;
	
	@GetMapping
	public List<EventoViewModel> ListaEventos() {
		
		var listaEventos = eventoRepository.findAll();
		
		return new EventoViewModel().converter(listaEventos);
	}
	
	@PostMapping
	public boolean CreateEvento(CreateEventoCommand command) {
		
		eventoRepository.save(command.converter());
		
		return true;
	}
}
