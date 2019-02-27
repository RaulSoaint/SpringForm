package com.example.pojo;

import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;


public class Person {

	@NotEmpty
	private String nombre;
	
	private String apellidos;
	@Range(min = 9, max = 9)
	private int telefono;
	
	private String correo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	@Override
	public String toString() {
		return "Person [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", correo=" + correo
				+ "]";
	}
	
	
}
