package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_cliente database table.
 * 
 */
@Entity
@Table(name="tbl_cliente")
@NamedQuery(name="TblCliente.findAll", query="SELECT t FROM TblCliente t")
public class TblCliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idcliente;

	@Column(name="`??????idcliente`")
	private int ______idcliente;

	@Column(name="`??apellido`")
	private String __apellido;

	@Column(name="`??email`")
	private String __email;

	@Column(name="`??nombre`")
	private String __nombre;

	private String apellido;

	private String dni;

	private String dni;

	private String email;

	private String nacion;

	private String nacion;

	private String nombre;

	private String sexo;

	private String sexo;

	private String telef;

	private String telef;

	public TblCliente() {
	}

	public int getIdcliente() {
		return this.idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public int get______idcliente() {
		return this.______idcliente;
	}

	public void set______idcliente(int ______idcliente) {
		this.______idcliente = ______idcliente;
	}

	public String get__apellido() {
		return this.__apellido;
	}

	public void set__apellido(String __apellido) {
		this.__apellido = __apellido;
	}

	public String get__email() {
		return this.__email;
	}

	public void set__email(String __email) {
		this.__email = __email;
	}

	public String get__nombre() {
		return this.__nombre;
	}

	public void set__nombre(String __nombre) {
		this.__nombre = __nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNacion() {
		return this.nacion;
	}

	public void setNacion(String nacion) {
		this.nacion = nacion;
	}

	public String getNacion() {
		return this.nacion;
	}

	public void setNacion(String nacion) {
		this.nacion = nacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelef() {
		return this.telef;
	}

	public void setTelef(String telef) {
		this.telef = telef;
	}

	public String getTelef() {
		return this.telef;
	}

	public void setTelef(String telef) {
		this.telef = telef;
	}

}