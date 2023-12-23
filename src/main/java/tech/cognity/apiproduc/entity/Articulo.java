package tech.cognity.apiproduc.entity;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="articulo")

public class Articulo {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	@Column(unique = true,nullable = false, length = 100)
	private String nombre;
	@Column(nullable=false)
	private Double precio;
	@Column(name="created_at", nullable=false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdAt;
	@Column(name="update_at")
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updatedAt;
	@Column(name="activo", nullable = false)
	private Boolean activo;
	public void setActivo(boolean b) {
		// TODO Auto-generated method stub
		
	}
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getNombre() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setNombre(Object nombre2) {
		// TODO Auto-generated method stub
		
	}
	public Object getPrecio() {
		// TODO Auto-generated method stub
		return null;
	}
	public void SetPrecio(Object precio2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
