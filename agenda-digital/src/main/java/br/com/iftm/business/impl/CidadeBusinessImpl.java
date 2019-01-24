package br.com.iftm.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import br.com.iftm.business.BusinessException;
import br.com.iftm.business.CidadeBusiness;
import br.com.iftm.dao.CidadeDAO;
import br.com.iftm.enfity.Cidade;
import br.com.iftm.enfity.enums.Estado;

@Service
public class CidadeBusinessImpl implements CidadeBusiness {

	@Autowired
	private CidadeDAO dao;

	@Override
	public Cidade create(Cidade cidade) throws BusinessException {

		if (StringUtils.isEmpty(cidade.getNome())) {
			throw new BusinessException("Nome Requerido!");
		}

		if (cidade.getEstado() == null) {
			throw new BusinessException("Estado Requerido!");
		}

		return dao.create(cidade);
	}

	@Override
	public List<Cidade> read() throws BusinessException {

		return dao.read();
	}

	@Override
	public List<Cidade> readByEstado(Estado estado) throws BusinessException {
		if (estado == null) {
			throw new BusinessException("Estado Requerido!");
		}
		return dao.readByEstado(estado);
	}

	@Override
	public Cidade update(Cidade cidade) throws BusinessException {

		if (cidade.getCodigo() == null) {
			throw new BusinessException("Codigo Requerido!");
		}
		if (StringUtils.isEmpty(cidade.getNome())) {
			throw new BusinessException("Nome Requerido!");
		}

		if (cidade.getEstado() == null) {
			throw new BusinessException("Estado Requerido!");
		}

		return dao.update(cidade);
	}

	@Override
	public void delete(Integer id) throws BusinessException {
		if (id == null) {
			throw new BusinessException("Codigo Requerido!");
		}
		dao.delete(id);

	}

} 