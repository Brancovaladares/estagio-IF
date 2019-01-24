package br.com.iftm.dao.impl;

//CAMADA DE DADOS

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.iftm.dao.TipoServicoDAO;
import br.com.iftm.entily.TipoServico;

@Repository
public class TipoServicoDAOImpl implements TipoServicoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	private List<TipoServico> lista = new ArrayList<>();
	private int indice = 0;

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.iftm.dao.TipoServicoDAO#create(br.com.iftm.entily.TipoServico)
	 */

	@Override
	public TipoServico create(TipoServico tipoServico) {

		sessionFactory.getCurrentSession().save(tipoServico);
		sessionFactory.getCurrentSession().flush();

		return tipoServico;
	}

	@Override
	public List<TipoServico> read() {

		return lista;
	}

	@Override
	public List<TipoServico> readByName(String nome) {

		List<TipoServico> listaRetorno = new ArrayList<>();
		// verifica na lista
		for (TipoServico tipoServico : lista) {
			if (tipoServico.getNome().toUpperCase().contains(nome.toUpperCase())) {
				listaRetorno.add(tipoServico);
			}
		}

		return listaRetorno;
	}

	@Override
	public TipoServico update(TipoServico tipoServico) {

		sessionFactory.getCurrentSession().update(tipoServico);
		sessionFactory.getCurrentSession().flush();

		return tipoServico;
	}

	@Override
	public void delete(Integer id) {

		for (TipoServico tipoServico2 : lista) {

			if (tipoServico2.getCodigo().equals(id)) {
				// remove da lista
				lista.remove(tipoServico2);
				break;
			}
		}
	}

}