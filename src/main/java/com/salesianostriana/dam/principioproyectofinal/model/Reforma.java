package com.salesianostriana.dam.principioproyectofinal.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reforma {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private LocalDate fecha_inicio;
	private LocalDate fecha_final;
	private double presupuesto;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name= "fk_reforma_trabajador"))
	private Trabajador jefeDeObra;
	
	public void addToReforma (Trabajador jefeDeObra) {
		
		this.jefeDeObra= jefeDeObra;
		jefeDeObra.getReformas().add(this);
	}
	public void removeFromReforma (Trabajador jefeDeObra) {
		jefeDeObra.getReformas().remove(this);
		this.jefeDeObra= null;
	}
	
	@ManyToOne
	@JoinColumn(foreignKey= @ForeignKey(name= "fk_reforma_cliente"))
	private Cliente propietario;
	
	public void addToReforma(Cliente propietario) {
		this.propietario= propietario;
		propietario.getReformas().add(this);
	}
	public void removeFromReforma (Cliente propietario) {
		propietario.getReformas().remove(this);
		this.propietario= null;
	}
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@ManyToMany(mappedBy="trabajaEnReforma", fetch = FetchType.EAGER)
	private List<Trabajador> ReformaTrabajadapor = new ArrayList<>();
	
}
