package model;

import java.sql.Date;

public class Materia {
	private int id;
	private String nombre;
	private int idNivel;
	private String codigo;
	private String urlClassroom;
	private boolean admiteMatricula;
	private Date fechaInicio;
	
	
	/**
	 * 
	 */
	public Materia() {
		super();
	}


	/**
	 * @param id
	 * @param nombre
	 * @param idNivel
	 * @param codigo
	 * @param urlClassroom
	 * @param admiteMatricula
	 * @param fecha
	 */
	public Materia(int id, String nombre, int idNivel, String codigo, String urlClassroom, boolean admiteMatricula,
			Date fechaInicio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.idNivel = idNivel;
		this.codigo = codigo;
		this.urlClassroom = urlClassroom;
		this.admiteMatricula = admiteMatricula;
		this.fechaInicio = fechaInicio;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdNivel() {
		return idNivel;
	}

	public void setIdNivel(int idNivel) {
		this.idNivel = idNivel;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getUrlClassroom() {
		return urlClassroom;
	}

	public void setUrlClassroom(String urlClassroom) {
		this.urlClassroom = urlClassroom;
	}

	public boolean isAdmiteMatricula() {
		return admiteMatricula;
	}

	public void setAdmiteMatricula(boolean admiteMatricula) {
		this.admiteMatricula = admiteMatricula;
	}

	public Date getFecha() {
		return fechaInicio;
	}

	public void setFecha(Date fecha) {
		this.fechaInicio = fecha;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Materia [id=" + id + ", nombre=" + nombre + ", idNivel=" + idNivel + ", codigo=" + codigo
				+ ", urlClassroom=" + urlClassroom + ", admiteMatricula=" + admiteMatricula + ", fechaInicio="
				+ fechaInicio + "]";
	}
}
