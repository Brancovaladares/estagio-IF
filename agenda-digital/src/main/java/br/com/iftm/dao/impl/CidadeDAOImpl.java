package br.com.iftm.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.iftm.dao.CidadeDAO;
import br.com.iftm.enfity.Cidade;
import br.com.iftm.enfity.enums.Estado;

@Repository
public class CidadeDAOImpl implements CidadeDAO {

	private List<Cidade> lista = new ArrayList<>();
	private int indice = 0;

	@Override
	public Cidade create(Cidade cidade) {
		cidade.setCodigo(indice++);
		lista.add(cidade);

		return cidade;
	}

	@Override
	public List<Cidade> read() {
		return lista;
	}

	@Override
	public List<Cidade> readByEstado(Estado estado) {
		List<Cidade> listaRetorno = new ArrayList<>();
		for (Cidade cidade : lista) {
			if (cidade.getEstado().equals(estado)) {
				listaRetorno.add(cidade);
			}
		}
		return listaRetorno;
	}

	@Override
	public Cidade update(Cidade cidade) {

		for (Cidade cidade2 : lista) {
			if (cidade2.getCodigo().equals(cidade.getCodigo())) {
				cidade2.setNome(cidade.getNome());
				cidade2.setEstado(cidade.getEstado());
			}

		}

		return cidade;
	}

	@Override
	public void delete(Integer id) {
		for (Cidade cidade2 : lista) {
			if (cidade2.getCodigo().equals(id)) {
				lista.remove(cidade2);
				break;
			}

		}
	}

}