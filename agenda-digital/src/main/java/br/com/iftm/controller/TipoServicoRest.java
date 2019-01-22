package br.com.iftm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.iftm.business.BusinessException;
import br.com.iftm.business.TipoServicoBusiness;
import br.com.iftm.business.impl.TipoServicoBusinessImpl;
import br.com.iftm.enfity.TipoServico;

@RestController // Habilita classe como um servico rest
@RequestMapping(value = "tiposervico") // Nome do Servico

public class TipoServicoRest {
@Autowired
	private TipoServicoBusiness business;
	private List<TipoServico> lista = new ArrayList<>();
	private int indice = 0;

	// create
	@PostMapping()
	public ResponseEntity<?> create(@RequestBody TipoServico tipoServico) {
		try {
			tipoServico = business.create(tipoServico);
			return ResponseEntity.ok(tipoServico);
		} catch (BusinessException e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e);
		}

	}

	// read
	@GetMapping
	public ResponseEntity<?> read() {

		try {
			List<TipoServico> lista = business.read();
			if (lista.isEmpty()) {
				return ResponseEntity.notFound().build();
			} else {
				return ResponseEntity.ok(lista);
			}

		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e);
		}

	}

	// readByName

	@GetMapping("/filtro/nome")
	public ResponseEntity<?> readByName(@PathParam("nome") String nome) {

		try {
			List<TipoServico> lista = business.readByName(nome);
			if (lista.isEmpty()) {
				return ResponseEntity.notFound().build();
			} else {
				return ResponseEntity.ok(lista);
			}

		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e);
		}

	}

//update

	@PutMapping
	public ResponseEntity<?> update(@RequestBody TipoServico tipoServico) throws BusinessException {

		try {
			tipoServico = business.update(tipoServico);
			return ResponseEntity.ok(tipoServico);
		} catch (BusinessException e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e);
		}

	}

	// Delete

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
		try {
			business.delete(id);
			return ResponseEntity.ok().build();
		} catch (BusinessException e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e);
		}

	}

}