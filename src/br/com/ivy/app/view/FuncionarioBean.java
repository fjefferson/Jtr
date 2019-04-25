package br.com.ivy.app.view;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.ivy.app.model.entity.Funcionario;
import br.com.ivy.app.model.service.abstraction.IServiceFuncionario;
import br.com.ivy.core.view.ViewHandler;


@Named
@ViewScoped
public class FuncionarioBean extends ViewHandler implements Serializable {

	private static final long serialVersionUID = 7427601269049478948L;

	private String state = getViewState().name();
	
//	@Inject
//	private IServiceFuncionario service;

	private Funcionario funcionario = new Funcionario();

	public FuncionarioBean() {
	}

	public void salvar(){
		if(isInsert()){
			setDefaltViewState();
		}else{
			prepareToInsert();
		}
			
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

//	@Override
//	public IServiceAbstract getService() {
//		return this.service;
//	}
	
	
}
