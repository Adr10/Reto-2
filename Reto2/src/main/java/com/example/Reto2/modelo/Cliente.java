package com.example.Reto2.modelo;

public class Cliente extends User {
	
	
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
