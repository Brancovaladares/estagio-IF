package br.com.iftm.business.impl;

//CAMADA DE NEGÓCIO (com cada função)

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import br.com.iftm.business.BusinessException;
import br.com.iftm.business.TipoServicoBusiness;
import br.com.iftm.dao.TipoServicoDAO;
import br.com.iftm.entily.TipoServico;

@Service
@Transactional
public class TipoServicoBusinessImpl implements TipoServicoBusiness {

	@Autowired // procura pela classe, evita de instanciar
	private TipoServicoDAO dao;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public TipoServico create(TipoServico tipoServico) throws BusinessException {
		// validação se está preenchido ou não
		if (StringUtils.isEmpty(tipoServico.getNome())) {

			throw new BusinessException("Nome Requerido!"); // excessão disparada pela camada Business
		}
		return dao.create(tipoServico); // trata a parte de persistência (via interface)
	}

	////////////////////////////////////////////////////////////////////////////////////

	@Override
	public List<TipoServico> read() {
		// chama a camada DAO (dados)
		return dao.read(); // trata a parte de persistência (via interface)
	}

	////////////////////////////////////////////////////////////////////////////////////

	@Override
	public List<TipoServico> readByName(String nome) throws BusinessException {
		// validação
		if (StringUtils.isEmpty(nome)) {
			throw new BusinessException("Nome Requerido!"); // excessão disparada pela camada Business
		}
		return dao.readByName(nome); // trata a parte de persistência (via interface)
	}

	////////////////////////////////////////////////////////////////////////////////////

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public TipoServico update(TipoServico tipoServico) throws BusinessException {

		if (tipoServico.getCodigo() == null) {
			throw new BusinessException("Nome Requerido!"); // excessão disparada pela camada Business
		}
		// validação se está preenchido ou não
		if (StringUtils.isEmpty(tipoServico.getNome())) {

			throw new BusinessException("Nome Requerido!"); // excessão disparada pela camada Business
		}
		return dao.update(tipoServico); // trata a parte de persistência (via interface)
	}

	////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void delete(Integer id) throws BusinessException {

		if (id == null) {

			throw new BusinessException("Nome Requerido!"); // excessão disparada pela camada Business
		}
		dao.delete(id); // trata a parte de persistência (via interface)
	}

}