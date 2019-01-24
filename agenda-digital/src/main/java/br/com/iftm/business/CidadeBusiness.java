package br.com.iftm.business;

import java.util.List;

import br.com.iftm.entily.Cidade;
import br.com.iftm.entily.enums.Estado;

public interface CidadeBusiness {

	/**
	 * Método responsavel por garantr os parametros obrigatórios, bem como solicitar
	 * a camada de acesso a dados que persista o objeto
	 * 
	 * @param cidade
	 * @return
	 * @throws BusinessException
	 */
	Cidade create(Cidade cidade) throws BusinessException;

	List<Cidade> read() throws BusinessException;

	List<Cidade> readByEstado(Estado estado) throws BusinessException;

	Cidade update(Cidade cidade) throws BusinessException;

	void delete(Integer id) throws BusinessException;

}
