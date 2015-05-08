package br.com.ivy.app.model.service.abstraction;

import java.io.Serializable;
import java.util.List;

import br.com.ivy.app.model.entity.Vendedor;

public interface IServiceVendedor extends Serializable{

	public Vendedor save(Vendedor vendedor);

	public void remove(Vendedor vendedor);

	public Vendedor find(Vendedor vendedor);

	public List<Vendedor> findAll();
	
	public List<Vendedor> findByExample(Vendedor m);
	
}
