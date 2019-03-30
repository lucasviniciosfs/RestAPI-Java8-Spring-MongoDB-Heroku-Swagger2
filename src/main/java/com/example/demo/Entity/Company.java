package com.example.demo.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Company")
public class Company implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String cnpj;
	
	public Company() {
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getid() {
		return id;
	}
	
	public void setid(Long id) {
		this.id = id;
	}
	
	@Column(name = "cnpj", nullable = false)
	public String getcnpj(){
		return cnpj;
	}
	
	public void setcnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", cnpj=" + cnpj + "]";
	}
	
	

}
