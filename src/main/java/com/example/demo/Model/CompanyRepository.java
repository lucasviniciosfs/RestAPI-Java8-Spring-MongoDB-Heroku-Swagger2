/**
 * 
 */
package com.example.demo.Model;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Company;

/**
 * @author Lucas
 *
 */
public interface CompanyRepository extends JpaRepository<Company, Long> {
	
	Company findByCnpj(String cnpj);

}
