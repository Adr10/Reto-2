package com.example.Reto2.modelo.Cliente;

import com.example.Reto2.modelo.User.UserPostRequest;

public class ClientePostRequest extends UserPostRequest{
	
	private Integer edad;

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
	public ClientePostRequest() {
		super();
	}

	public ClientePostRequest(Integer edad) {
		super();
		this.edad = edad;
	}

	@Override
	public String toString() {
		return super.toString() + ", edad=" + edad + "]";
	}
	
	
	
	
}
