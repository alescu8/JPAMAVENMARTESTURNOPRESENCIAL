package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_usuario database table.
 * 
 */
@Entity
@Table(name="tbl_usuario")
@NamedQuery(name="TblUsuario.findAll", query="SELECT t FROM TblUsuario t")
public class TblUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idusuario;

	@Column(name="`??????idusuario`")
	private int ______idusuario;

	@Column(name="`??password`")
	private String __password;

	@Column(name="`??usuario`")
	private String __usuario;

	private String clave;

	private String clave;

	private int idusuario;

	private int idusuario;

	private String pasword;

	private String usuario;

	private String usuario;

	private String usurio;

	public TblUsuario() {
	}

	public int getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public int get______idusuario() {
		return this.______idusuario;
	}

	public void set______idusuario(int ______idusuario) {
		this.______idusuario = ______idusuario;
	}

	public String get__password() {
		return this.__password;
	}

	public void set__password(String __password) {
		this.__password = __password;
	}

	public String get__usuario() {
		return this.__usuario;
	}

	public void set__usuario(String __usuario) {
		this.__usuario = __usuario;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public int getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public int getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getPasword() {
		return this.pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getUsurio() {
		return this.usurio;
	}

	public void setUsurio(String usurio) {
		this.usurio = usurio;
	}

}