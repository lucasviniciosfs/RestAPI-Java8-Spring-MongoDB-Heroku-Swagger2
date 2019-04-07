package com.example.demo.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {
	
	@RequestMapping("/getCompanybyCNPJ/{cnpj}")
	public String getCompanybyCNPJ(@PathVariable("cnpj") String cnpj) {
		return "Empresa de cnpj:"+ cnpj;	
	}

}
