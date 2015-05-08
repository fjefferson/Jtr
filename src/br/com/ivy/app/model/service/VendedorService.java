package br.com.ivy.app.model.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ivy.app.model.entity.Vendedor;
import br.com.ivy.app.model.service.abstraction.IServiceVendedor;
import br.com.ivy.core.model.service.abstraction.AbstractPersistence;

@Service
@Transactional
public class VendedorService extends AbstractPersistence<Vendedor> implements IServiceVendedor {

	private static final long serialVersionUID = -850303357378830241L;

	public VendedorService() {
		super(Vendedor.class);
	}
	

}
