package com.example.demo.DTO;

public class CompanyDTO {
	
	private Long id;
	private String cnpj;
	
	public CompanyDTO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "CompanyDTO [id=" + id + ", cnpj=" + cnpj + "]";
	}
	
	
}
