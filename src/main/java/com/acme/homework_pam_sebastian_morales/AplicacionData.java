package com.acme.homework_pam_sebastian_morales;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class AplicacionData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Nombres")
	private java.lang.String nombres;
	@org.kie.api.definition.type.Label("Apellidos")
	private java.lang.String apellidos;
	@org.kie.api.definition.type.Label("Condominio Aprobado")
	private boolean condominioAprobado;

	@org.kie.api.definition.type.Label("Observaciones")
	private java.lang.String observaciones;

	@org.kie.api.definition.type.Label("Es propietario")
	private boolean ispropietario;

	@org.kie.api.definition.type.Label(value = "Direccion")
	private java.lang.String direccion;

	public AplicacionData() {
	}

	public java.lang.String getNombres() {
		return this.nombres;
	}

	public void setNombres(java.lang.String nombres) {
		this.nombres = nombres;
	}

	public java.lang.String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(java.lang.String apellidos) {
		this.apellidos = apellidos;
	}

	public boolean isCondominioAprobado() {
		return this.condominioAprobado;
	}

	public void setCondominioAprobado(boolean condominioAprobado) {
		this.condominioAprobado = condominioAprobado;
	}

	public java.lang.String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(java.lang.String observaciones) {
		this.observaciones = observaciones;
	}

	public boolean isIspropietario() {
		return this.ispropietario;
	}

	public void setIspropietario(boolean ispropietario) {
		this.ispropietario = ispropietario;
	}

	public java.lang.String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(java.lang.String direccion) {
		this.direccion = direccion;
	}

	public AplicacionData(java.lang.String nombres, java.lang.String apellidos,
			boolean condominioAprobado, java.lang.String observaciones,
			boolean ispropietario, java.lang.String direccion) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.condominioAprobado = condominioAprobado;
		this.observaciones = observaciones;
		this.ispropietario = ispropietario;
		this.direccion = direccion;
	}

}