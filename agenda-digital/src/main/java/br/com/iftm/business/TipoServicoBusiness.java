package br.com.iftm.business;

import java.util.List;

import br.com.iftm.entily.TipoServico;

public interface TipoServicoBusiness {

	/**
	 * Método responsavel por garantr os parametros obrigatórios, bem como solicitar
	 * a camada de acesso a dados que persista o objeto
	 * 
	 * @param tipoServico
	 * @return
	 */
	TipoServico create(TipoServico tipoServico) throws BusinessException;

	/**
	 * 
	 */
	List<TipoServico> read() throws BusinessException;

	/**
	 * 
	 */
	List<TipoServico> readByName(String nome) throws BusinessException;

	/**
	 * 
	 */
	TipoServico update(TipoServico tipoServico) throws BusinessException;

	/**
	 * 
	 */
	void delete(Integer id) throws BusinessException;
}
