/**
 * 
 */
package com.example.demo.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Company;

/**
 * @author Lucas
 * Class used to do operations with bd
 */
@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
	
	Company findByCnpj(String cnpj);

}
