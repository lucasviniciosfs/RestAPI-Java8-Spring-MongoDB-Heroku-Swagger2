package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

public class Response<T> {

/**
 * class to standardize the responses of my API
 */
	
	private T data;
	private List<String> errors;
	
	public Response() {
		
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public List<String> getErrors() {
		if (this.errors == null) {
			this.errors = new ArrayList<String>();
		}
		return errors;
	}
	
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
}
