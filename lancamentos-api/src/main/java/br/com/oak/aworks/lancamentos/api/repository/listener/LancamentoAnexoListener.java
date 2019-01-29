package br.com.oak.aworks.lancamentos.api.repository.listener;

import javax.persistence.PostLoad;

import org.apache.commons.lang.StringUtils;

import br.com.oak.aworks.lancamentos.api.LancamentosApiApplication;
import br.com.oak.aworks.lancamentos.api.model.Lancamento;
import br.com.oak.aworks.lancamentos.api.storage.S3;

public class LancamentoAnexoListener {

	@PostLoad
	public void postLoad(Lancamento lancamento) {

		if (StringUtils.isNotBlank(lancamento.getAnexo())) {

			S3 s3 = LancamentosApiApplication.getBean(S3.class);

			lancamento.setUrlAnexo(s3.configurarUrl(lancamento.getAnexo()));
		}
	}
}
