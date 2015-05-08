package br.com.ivy.core.view;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


public abstract class ViewHandler{
	
	private ViewState viewState = ViewState.SEARCH;
	
	public enum ViewState{
		UPDATE, INSERT, SEARCH, DELETE;		
	};

	public ViewHandler() {
		setDefaltViewState();
	}
	
	public void setDefaltViewState(){
		this.viewState = ViewState.SEARCH;
	}

	public void prepareToUpdate() {
		this.viewState = ViewState.UPDATE;
	}

	public void prepareToInsert() {
		this.viewState = ViewState.INSERT;
	}

	public void prepareToSearch() {
		this.viewState = ViewState.SEARCH;
	}

	public void prepareToDelete() {
		this.viewState = ViewState.DELETE;
	}

	public boolean isUpdate(){ return ViewState.UPDATE.equals(viewState);}
	public boolean isInsert(){ return ViewState.INSERT.equals(viewState);}
	public boolean isSearch(){ return ViewState.SEARCH.equals(viewState);}
	public boolean isDelete(){ return ViewState.DELETE.equals(viewState);}
	
	public void cancel(){
		setDefaltViewState();
	}
	
	public void addMessageSecess(String message){
		FacesMessage m = new FacesMessage(message);
		m.setSeverity(FacesMessage.SEVERITY_INFO);
		addMessageToContext(m);
	}

	private void addMessageToContext(FacesMessage message){
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage("teste",message);
	}

	public ViewState getViewState() {
		return viewState;
	}
}
