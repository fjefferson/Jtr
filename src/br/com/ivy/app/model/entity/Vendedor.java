package br.com.ivy.app.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.ivy.core.model.entity.abstraction.AbstractEntity;

/**
 * @author jocelio
 *
 */
@Entity
@Table(name="tb_vendedor")
public class Vendedor implements AbstractEntity{

	private static final long serialVersionUID = -4506731785085084623L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(nullable=false)
	private String primeiroNome;
	
	@Column
	private String ultimoNome;
	
	@Column(unique=true)
	private String matricula;
	
	@Column(nullable=false)
	@Temporal(TemporalType.DATE)
	private Date dataAdmicao;
	
//	@OneToMany(mappedBy="vendedor", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
//	@Where(clause="ATIVO=1")
//	private List<Mercadoria> mercadorias = new ArrayList<Mercadoria>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getDataAdmicao() {
		return dataAdmicao;
	}

	public void setDataAdmicao(Date dataAdmicao) {
		this.dataAdmicao = dataAdmicao;
	}

//	public List<Mercadoria> getMercadorias() {
//		return mercadorias;
//	}
//
//	public void setMercadorias(List<Mercadoria> mercadorias) {
//		this.mercadorias = mercadorias;
//	}

	


}
