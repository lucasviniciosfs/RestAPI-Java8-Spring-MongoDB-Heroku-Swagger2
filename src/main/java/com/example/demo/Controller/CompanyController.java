package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.CompanyService;

/**
 * 
 * @author Lucas
 * Class used to receive the requests about Company
 */
@RestController
@RequestMapping("/company")
public class CompanyController {
	
	@Autowired
	CompanyService companyService;
	
	@RequestMapping("/getCompanybyCNPJ/{cnpj}")
	public String getCompanybyCNPJ(@PathVariable("cnpj") String cnpj) {
		companyService.testarServico();
		return "Empresa de cnpj:"+ cnpj;	
	}

}
