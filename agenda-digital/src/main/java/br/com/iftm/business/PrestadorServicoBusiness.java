package br.com.iftm.business;

import java.util.List;

import br.com.iftm.enfity.PrestadorServico;

public interface PrestadorServicoBusiness {

	/**
	 * Metodo responsavel por garantir os parametros obrigatorios, bem como
	 * solicitar a camada de acesso a dados que persista o objeto
	 * ({@link PrestadorServico}.
	 * 
	 * @param PrestadorServico Objeto a ser persistido.
	 * @return Objeto persistido.
	 * @throws BusinessException
	 */

	PrestadorServico create(PrestadorServico tipoServico) throws BusinessException;

	List<PrestadorServico> read() throws BusinessException;

	PrestadorServico update(PrestadorServico tipoServico) throws BusinessException;

	void delete(Integer id) throws BusinessException;

}