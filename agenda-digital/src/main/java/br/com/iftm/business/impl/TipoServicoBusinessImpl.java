package br.com.iftm.business.impl;

import java.util.List;

import org.springframework.util.StringUtils;

import br.com.iftm.business.BusinessException;
import br.com.iftm.business.TipoServicoBusiness;
import br.com.iftm.dao.TipoServicoDAO;
import br.com.iftm.dao.impl.TipoServicoDAOImpl;
import br.com.iftm.enfity.TipoServico;

public class TipoServicoBusinessImpl implements TipoServicoBusiness {

	private TipoServicoDAO dao = new TipoServicoDAOImpl();

	@Override
	public TipoServico create(TipoServico tipoServico) throws BusinessException {
		if (StringUtils.isEmpty(tipoServico.getNome())) {
			throw new BusinessException("Nome Requerido!");
		}
		return dao.create(tipoServico);
	}

	@Override
	public List<TipoServico> read() {
		return dao.read();
	}

	@Override
	public List<TipoServico> readByName(String nome) throws BusinessException {

		if (StringUtils.isEmpty(nome)) {
			throw new BusinessException("Nome Requerido!");
		}

		return dao.readByName(nome);
	}

	@Override
	public TipoServico update(TipoServico tipoServico) throws BusinessException {

		if (tipoServico.getCodigo() == null) {
			throw new BusinessException("Codigo Requerido!");

		}

		if (StringUtils.isEmpty(tipoServico.getNome())) {
			throw new BusinessException("Nome Requerido!");
		}

		return dao.update(tipoServico);
	}

	@Override
	public void delete(Integer id) throws BusinessException {
		if (id == null) {
			throw new BusinessException("Codigo Requerido!");
		}

		dao.delete(id);
	}

}