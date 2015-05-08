package br.com.ivy.app.model.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ivy.app.model.entity.Funcionario;
import br.com.ivy.app.model.service.abstraction.IServiceFuncionario;
import br.com.ivy.core.model.service.abstraction.AbstractPersistence;

@Service
@Transactional
public class FuncionarioService extends AbstractPersistence<Funcionario> implements IServiceFuncionario {

	private static final long serialVersionUID = -850303357378830241L;

	public FuncionarioService() {
		super(Funcionario.class);
	}

}
