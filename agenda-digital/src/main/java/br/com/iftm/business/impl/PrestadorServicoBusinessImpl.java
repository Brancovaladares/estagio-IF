package br.com.iftm.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import br.com.iftm.business.BusinessException;
import br.com.iftm.business.PrestadorServicoBusiness;
import br.com.iftm.dao.PrestadorServicoDAO;
import br.com.iftm.enfity.PrestadorServico;
import br.com.iftm.enfity.Telefone;
import br.com.iftm.enfity.TipoServico;

public class PrestadorServicoBusinessImpl implements PrestadorServicoBusiness {

	@Autowired
	private PrestadorServicoDAO dao;
	private List<PrestadorServico> lista = new ArrayList<>();

	@Override
	public PrestadorServico create(PrestadorServico prestadorServico) throws BusinessException {

		if (StringUtils.isEmpty(prestadorServico.getNome())) {
			throw new BusinessException("Nome Requerido!");
		}

		if (prestadorServico.getCidade() == null || prestadorServico.getCidade().getCodigo() == null) {
			throw new BusinessException("Cidade Requerido!");
		}

		if (prestadorServico.getTipoLogradouro() == null) {
			throw new BusinessException("Tipo Logradouro Requerido!");
		}

		if (StringUtils.isEmpty(prestadorServico.getLogradouro())) {
			throw new BusinessException("Logradouro Requerido!");
		}

		if (StringUtils.isEmpty(prestadorServico.getBairro())) {
			throw new BusinessException("Bairro Requerido!");
		}

		if (StringUtils.isEmpty(prestadorServico.getCep())) {
			throw new BusinessException("Cep Requerido!");
		}

		if (prestadorServico.getTelefone() == null || prestadorServico.getTelefone().isEmpty()) {
			throw new BusinessException("Pelos menos um Telefone é Requerido!");
		}

		for (Telefone telefone : prestadorServico.getTelefone()) {

			if (telefone.getNumero() == null) {
				throw new BusinessException("Numero Requerido!");
			}

			if (telefone.getDdd() == null) {
				throw new BusinessException("DDD Requerido!");
			}

		}

		if (prestadorServico.getTipoServico() == null || prestadorServico.getTipoServico().isEmpty()) {
			throw new BusinessException("Tipo Servico Requerido!");
		}

		for (TipoServico tipoServico : prestadorServico.getTipoServico()) {

			if (tipoServico.getCodigo() == null) {
				throw new BusinessException("Tipo Servico Requerido!");
			}
		}

		return dao.create(prestadorServico);
	}

	@Override
	public List<PrestadorServico> read() throws BusinessException {

		return lista;
	}

	@Override
	public PrestadorServico update(PrestadorServico prestadorServico) throws BusinessException {

		if (prestadorServico.getCodigo() == null) {
			throw new BusinessException("Codigo Requerido!");
		}
		if (StringUtils.isEmpty(prestadorServico.getNome())) {
			throw new BusinessException("Nome Requerido!");
		}

		if (prestadorServico.getCidade() == null || prestadorServico.getCidade().getCodigo() == null) {
			throw new BusinessException("Cidade Requerido!");
		}

		if (prestadorServico.getTipoLogradouro() == null) {
			throw new BusinessException("Tipo Logradouro Requerido!");
		}

		if (StringUtils.isEmpty(prestadorServico.getLogradouro())) {
			throw new BusinessException("Logradouro Requerido!");
		}

		if (StringUtils.isEmpty(prestadorServico.getBairro())) {
			throw new BusinessException("Bairro Requerido!");
		}

		if (StringUtils.isEmpty(prestadorServico.getCep())) {
			throw new BusinessException("Cep Requerido!");
		}

		if (prestadorServico.getTelefone() == null || prestadorServico.getTelefone().isEmpty()) {
			throw new BusinessException("Pelos menos um Telefone é Requerido!");
		}

		for (Telefone telefone : prestadorServico.getTelefone()) {

			if (telefone.getNumero() == null) {
				throw new BusinessException("Numero Requerido!");
			}

			if (telefone.getDdd() == null) {
				throw new BusinessException("DDD Requerido!");
			}

		}

		if (prestadorServico.getTipoServico() == null || prestadorServico.getTipoServico().isEmpty()) {
			throw new BusinessException("Tipo Servico Requerido!");
		}

		for (TipoServico tipoServico : prestadorServico.getTipoServico()) {

			if (tipoServico.getCodigo() == null) {
				throw new BusinessException("Tipo Servico Requerido!");
			}
		}

		return dao.update(prestadorServico);

	}

	@Override
	public void delete(Integer id) throws BusinessException {

		if (id == null) {
			throw new BusinessException("Codigo Requerido!");
		}
		dao.delete(id);
	}

}