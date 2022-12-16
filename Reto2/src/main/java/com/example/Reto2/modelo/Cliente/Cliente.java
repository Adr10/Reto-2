package com.example.Reto2.modelo.Cliente;

import com.example.Reto2.modelo.User.User;

import jakarta.persistence.Column;

public class Cliente extends User {
	
	@Column(length = 5)
	private Integer edad;
	
	
	
	public Cliente() {
		
	}

	public Cliente(Integer edad) {
		super();
		this.edad = edad;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		
		return super.toString() + ", edad=" + edad + "]";
		
		
	}

	
	



	
	
	
	
	

}
