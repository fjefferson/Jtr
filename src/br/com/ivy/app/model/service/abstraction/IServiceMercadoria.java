package br.com.ivy.app.model.service.abstraction;

import java.io.Serializable;
import java.util.List;

import br.com.ivy.app.model.entity.Mercadoria;

public interface IServiceMercadoria extends Serializable {

		public Mercadoria save(Mercadoria mercadoria);

		public void remove(Mercadoria mercadoria);

		public Mercadoria find(Mercadoria mercadoria);

		public List<Mercadoria> findAll();
		
		public List<Mercadoria> findByExample(Mercadoria m);
		
}
