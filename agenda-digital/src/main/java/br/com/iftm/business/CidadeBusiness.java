package br.com.iftm.business;

import java.util.List;

import br.com.iftm.enfity.Cidade;
import br.com.iftm.enfity.enums.Estado;

public interface CidadeBusiness {

	/**
	 * Metodo responsavel por garantir os parametros obrigatorios, bem como
	 * solicitar a camada de acesso a dados que persista o objeto ({@link Cidade}.
	 * 
	 * @param Cidade Objeto a ser persistido.
	 * @return Objeto persistido.
	 * @throws BusinessException
	 */

	Cidade create(Cidade cidade) throws BusinessException;

	List<Cidade> read() throws BusinessException;

	List<Cidade> readByEstado(Estado nome) throws BusinessException;

	Cidade update(Cidade cidade) throws BusinessException;

	void delete(Integer id) throws BusinessException;
}