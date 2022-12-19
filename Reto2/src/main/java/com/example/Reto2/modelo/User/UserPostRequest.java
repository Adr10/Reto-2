package com.example.Reto2.modelo.User;



public class UserPostRequest  {
	

	
	private String nombre ;

	private String apellido;
	
	private String email;

	private String password;
	
	private Integer id_Roll;
	
	
	
	

	public UserPostRequest() {
		super();
	}

	public UserPostRequest(String nombre, String apellido, String email, String password, Integer id_Roll) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
		this.id_Roll = id_Roll;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getId_Roll() {
		return id_Roll;
	}

	public void setId_Roll(Integer id_Roll) {
		this.id_Roll = id_Roll;
	}

	@Override
	public String toString() {
		return "UserPostRequest [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", password="
				+ password + ", id_Roll=" + id_Roll ;
	}
	
	
	
	
}
