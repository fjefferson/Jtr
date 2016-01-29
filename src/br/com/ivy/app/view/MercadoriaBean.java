package br.com.ivy.app.view;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Named;

import br.com.ivy.app.model.entity.Mercadoria;
import br.com.ivy.app.model.service.abstraction.IServiceMercadoria;
import br.com.ivy.core.view.ViewHandler;


@Named
@ViewScoped
public class MercadoriaBean extends ViewHandler implements Serializable {

	private static final long serialVersionUID = 7427601269049478948L;

//	@Inject
	private IServiceMercadoria service;

	private Mercadoria mercadoria = new Mercadoria();

	private DataModel<Mercadoria> mercadorias;

	
	public void teste(){
		System.out.println(service.find(mercadoria));
	}

	public void salvar(){
		prepareToSearch();
		service.save(mercadoria);
		this.mercadoria = new Mercadoria();
		addMessageSecess("Produto salvo com sucesso!");
	}
	
	public void deletar(){
		service.remove(mercadorias.getRowData());
	}
	
	public void find(){
		mercadorias.setWrappedData( service.findByExample(mercadoria) );
	}
	
	public void prepareUpdate(){
		prepareToUpdate();
		this.mercadoria = mercadorias.getRowData();
	}
	public void prepareInsert(){
		prepareToInsert();
		this.mercadoria = new Mercadoria();
	}

	public Mercadoria getMercadoria() {
		return mercadoria;
	}

	public void setMercadoria(Mercadoria mercadoria) {
		this.mercadoria = mercadoria;
	}

	public DataModel<Mercadoria> getMercadorias() {
		return mercadorias;
	}

	public void setMercadorias(DataModel<Mercadoria> mercadorias) {
		this.mercadorias = mercadorias;
	}

	public void carregaLista(ComponentSystemEvent evt){
		this.mercadorias = new ListDataModel<Mercadoria>();
		this.mercadorias.setWrappedData(service.findAll());
	}



}
