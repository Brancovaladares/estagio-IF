package br.com.iftm.business;

import java.util.List;

import br.com.iftm.entily.Cidade;
import br.com.iftm.entily.PrestadorServico;

public interface PrestadorServicoBusiness {

	/**
	 * Método responsavel por garantr os parametros obrigatórios, bem como solicitar
	 * a camada de acesso a dados que persista o objeto
	 * 
	 * @param prestadorServ
	 * @return
	 */
	PrestadorServico create(PrestadorServico prestadorServ) throws BusinessException;

	List<PrestadorServico> read() throws BusinessException;

	List<PrestadorServico> readByName(String nome) throws BusinessException;

	List<PrestadorServico> readByCidade(Cidade cidade) throws BusinessException;

	PrestadorServico update(PrestadorServico prestadorServ) throws BusinessException;

	void delete(Integer id) throws BusinessException;

}
