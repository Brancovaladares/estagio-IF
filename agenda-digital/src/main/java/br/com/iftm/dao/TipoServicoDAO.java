package br.com.iftm.dao;

import java.util.List;

import br.com.iftm.enfity.TipoServico;

public interface TipoServicoDAO {

	/**
	 * Metodo responsavel por persistir o objeto {@ TipoServico} na base de 
	 * dados.
	 * 
	 * @param tipoServico Objeto a ser persistido.
	 * @return
	 */
	
	TipoServico create(TipoServico tipoServico);
	
	/**
	 * Metodo responsavel por recuperar da base de dados todos os objeto
	 * {@link TipoServico
	 * 
	 * @return Lista de {@ TipoServico}
	 */
	
	List<TipoServico> read();
	
	/** Metodo responsavel por recuperar da base de dados todos os objeto
	 * ({@link TipoServico}, cojo seu nome possua parte do paramento Nome.
	 * 
	 * @return Lista de {@ TipoServico}
	 */
	
	List<TipoServico> readByName(String nome);
	
	/** Metodo responsavel por persistir (atualizar) na base de dados o objeto
	 * ({@link TipoServico}.
	 * 
	 * @return Objeto persistido.
	 */
	
	TipoServico update(TipoServico tipoServico);
	
	/** Metodo responsavel por (deletar) da base de dados um objeto
	 * ({@link TipoServico}.
	 * 
	 * @return
	 */
	
	void delete(Integer id);
}