package br.com.ivy.app.model.service.abstraction;

import java.io.Serializable;
import java.util.List;

import br.com.ivy.app.model.entity.Funcionario;

public interface IServiceFuncionario extends Serializable {

	public Funcionario save(Funcionario vendedor);

	public void remove(Funcionario vendedor);

	public Funcionario find(Funcionario vendedor);

	public List<Funcionario> findAll();

	
}
