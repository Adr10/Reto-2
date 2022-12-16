package com.example.Reto2.modelo.Trabajador;

import java.util.Date;

import com.example.Reto2.modelo.User.User;

import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class Trabajador extends User{
	
	
	@Temporal(TemporalType.DATE)
	private Date fec_alta;
	@Temporal(TemporalType.DATE)
	private Date fec_baja;
	@Column(length = 60)
	private Long sueldo;
	
	
	
	
	public Date getFec_alta() {
		return fec_alta;
	}
	public void setFec_alta(Date fec_alta) {
		this.fec_alta = fec_alta;
	}
	public Date getFec_baja() {
		return fec_baja;
	}
	public void setFec_baja(Date fec_baja) {
		this.fec_baja = fec_baja;
	}
	public Long getSueldo() {
		return sueldo;
	}
	public void setSueldo(Long sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return super.toString() + ", fec_alta=" + fec_alta + ", fec_baja=" + fec_baja + ", sueldo=" + sueldo + "]";
	}
	
	
	

}
