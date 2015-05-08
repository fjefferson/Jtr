package br.com.ivy.app.model.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.ivy.core.model.entity.abstraction.AbstractEntity;

/**
 * @author jocelio.lima
 *
 */
/**
 * @author jocelio.lima
 *
 */
@Entity
@Table(name="tb_mercadoria")
public class Mercadoria implements AbstractEntity {

	private static final long serialVersionUID = 8686080664380745672L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String nome;

	private String descricao;

	private Integer quantidade;

	private Double preco;
	
	private Boolean ativo;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

//	public Vendedor getVendedor() {
//		return vendedor;
//	}
//
//	public void setVendedor(Vendedor vendedor) {
//		this.vendedor = vendedor;
//	}



	
}
