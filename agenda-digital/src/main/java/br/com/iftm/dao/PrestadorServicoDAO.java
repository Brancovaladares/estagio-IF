package br.com.iftm.dao;

import java.util.List;

import br.com.iftm.enfity.PrestadorServico;

public interface PrestadorServicoDAO {

	/**
	 * Metodo responsavel por persistir o objeto {@ PrestadorServico} na base de
	 * dados.
	 * 
	 * @param PrestadorServico Objeto a ser persistido.
	 * @return
	 */

	PrestadorServico create(PrestadorServico prestadorServico);

	/**
	 * Metodo responsavel por recuperar da base de dados todos os objeto
	 * {@link PrestadorServico
	 * 
	 * @return Lista de {@ PrestadorServico}
	 */

	List<PrestadorServico> read();

	/**
	 * Metodo responsavel por recuperar da base de dados todos os objeto
	 * ({@link PrestadorServico}, cojo seu nome possua parte do paramento Nome.
	 * 
	 * @return Lista de {@ PrestadorServico}
	 */

	PrestadorServico update(PrestadorServico cidade);

	/**
	 * Metodo responsavel por (deletar) da base de dados um objeto
	 * ({@link PrestadorServico}.
	 * 
	 * @return
	 */

	void delete(Integer id);
}