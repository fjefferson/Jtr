package br.com.ivy.app.model.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ivy.app.model.entity.Mercadoria;
import br.com.ivy.app.model.service.abstraction.IServiceMercadoria;
import br.com.ivy.core.model.entity.abstraction.AbstractEntity;
import br.com.ivy.core.model.service.abstraction.AbstractPersistence;

@Service
@Transactional
public class MercadoriaService extends AbstractPersistence<Mercadoria> implements IServiceMercadoria{

	private static final long serialVersionUID = -4981714622824940048L;


	public MercadoriaService() {
		super(Mercadoria.class);
	}
	  	
}
