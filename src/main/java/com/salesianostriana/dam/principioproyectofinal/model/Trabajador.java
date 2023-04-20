package com.salesianostriana.dam.principioproyectofinal.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Trabajador {
	
	@Id
	@GeneratedValue
	private Long id_trabajador;
	
	private String nombre;
	private String apellido;
	private String correo_electronico;
	private Long contraseña;
	private double sueldoBase;
	private double precioHoraExtra;
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(mappedBy= "jefeDeObra", fetch= FetchType.EAGER)
	@Builder.Default
	private List <Reforma> reformas = new ArrayList<> ();

}
