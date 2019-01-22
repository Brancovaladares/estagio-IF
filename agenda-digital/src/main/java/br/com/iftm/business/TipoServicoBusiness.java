package br.com.iftm.business;

import java.util.List;

import br.com.iftm.enfity.TipoServico;

public interface TipoServicoBusiness {

	/**
	 * Metodo responsavel por garantir os parametros obrigatorios, bem como
	 * solicitar a camada de acesso a dados que persista o objeto
	 * ({@link TipoServico}.
	 * 
	 * @param TipoServico Objeto a ser persistido.
	 * @return Objeto persistido.
	 * @throws BusinessException
	 */

	TipoServico create(TipoServico tipoServico) throws BusinessException;

	List<TipoServico> read() throws BusinessException;

	List<TipoServico> readByName(String nome) throws BusinessException;

	TipoServico update(TipoServico tipoServico) throws BusinessException;

	void delete(Integer id) throws BusinessException;

}