package com.example.demo.Security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtil {
	
	public static String gerarBCrypt(String password) throws Exception {
		if (password.isEmpty()) 
			throw new Exception("Password is null!");
		
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		return bCryptEncoder.encode(password);
	}
	
	public static boolean PasswordIsValid(String password, String passwordEncoded) throws Exception {
		if (password.isEmpty()) 
			throw new Exception("Password is null!");
		
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		return bCryptEncoder.matches(password, passwordEncoded);
	}

}
