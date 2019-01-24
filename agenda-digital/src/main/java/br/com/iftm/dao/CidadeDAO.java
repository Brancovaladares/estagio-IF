package br.com.iftm.dao;

import java.util.List;

import br.com.iftm.enfity.Cidade;
import br.com.iftm.enfity.enums.Estado;

public interface CidadeDAO {

	/**
	 * Metodo responsavel por persistir o objeto {@ Cidade} na base de dados.
	 * 
	 * @param Cidade Objeto a ser persistido.
	 * @return
	 */

	Cidade create(Cidade cidade);

	/**
	 * Metodo responsavel por recuperar da base de dados todos os objeto
	 * {@link Cidade
	 * 
	 * @return Lista de {@ Cidade}
	 */

	List<Cidade> read();

	/**
	 * Metodo responsavel por recuperar da base de dados todos os objeto
	 * ({@link Cidade}, cojo seu nome possua parte do paramento Nome.
	 * 
	 * @return Lista de {@ Cidade}
	 */

	List<Cidade> readByEstado(Estado estado);

	/**
	 * Metodo responsavel por persistir (atualizar) na base de dados o objeto
	 * ({@link Cidade}.
	 * 
	 * @return Objeto persistido.
	 */

	Cidade update(Cidade Cidade);

	/**
	 * Metodo responsavel por (deletar) da base de dados um objeto ({@link Cidade}.
	 * 
	 * @return
	 */

	void delete(Integer id);
}