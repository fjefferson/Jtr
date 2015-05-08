package br.com.ivy.app.view;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ViewScoped;
import javax.faces.model.DataModel;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.ivy.app.model.entity.Vendedor;
import br.com.ivy.app.model.service.abstraction.IServiceVendedor;
import br.com.ivy.core.view.ViewHandler;


@Named
@ViewScoped
public class VendedorBean extends ViewHandler implements Serializable {

	private static final long serialVersionUID = 7427601269049478948L;

	@Inject
	private IServiceVendedor service;

	private Vendedor vendedor = new Vendedor();

	private Long idSelecionado;
	
	private DataModel<Vendedor> vendedores;

	public VendedorBean() {
		super();
	}

	public void salvar(){
		prepareToSearch();
		vendedor.setDataAdmicao(new Date());
		service.save(vendedor);
		this.vendedor = new Vendedor();
		addMessageSecess("Vendedor salvo com sucesso!");
	}
	
	public void deletar(){
		service.remove(vendedores.getRowData());
	}
	
	public void find(){
		vendedores.setWrappedData( service.findAll() );
	}
	
	public void prepareUpdate(){
		prepareToUpdate();
		this.vendedor = vendedores.getRowData();
	}
	public void prepareInsert(){
		prepareToInsert();
		this.vendedor = new Vendedor();
	}
	
	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public DataModel<Vendedor> getVendedores() {
		return vendedores;
	}

	public void setVendedores(DataModel<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}





}
