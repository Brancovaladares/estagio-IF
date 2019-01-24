package br.com.iftm.controller;

import java.util.List;

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
import br.com.iftm.business.PrestadorServicoBusiness;
import br.com.iftm.enfity.PrestadorServico;

@RestController // Habilita classe como um servico rest
@RequestMapping(value = "/prestadorServico") // Nome do Servico

public class PrestadorServicoRest {

	@Autowired
	private PrestadorServicoBusiness business;

	// create
	@PostMapping()
	public ResponseEntity<?> create(@RequestBody PrestadorServico prestadorServico) {
		try {
			prestadorServico = business.create(prestadorServico);
			return ResponseEntity.ok(prestadorServico);
		} catch (BusinessException e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e);
		}

	}

	// read
	@GetMapping
	public ResponseEntity<?> read() {

		try {
			List<PrestadorServico> lista = business.read();
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
	public ResponseEntity<?> update(@RequestBody PrestadorServico prestadorServico) throws BusinessException {

		try {
			prestadorServico = business.update(prestadorServico);
			return ResponseEntity.ok(prestadorServico);
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