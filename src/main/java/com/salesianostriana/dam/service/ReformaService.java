package com.salesianostriana.dam.service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.principioproyectofinal.model.Cliente;
import com.salesianostriana.dam.principioproyectofinal.model.Reforma;
import com.salesianostriana.dam.principioproyectofinal.model.Trabajador;

@Service
public class ReformaService {
	
	List<Reforma> getLista(){
		return Arrays.asList(
				new Reforma(1, LocalDate.of(2023, 4, 1), LocalDate.of(2023, 4, 23), 2034.56, new Trabajador(1, "Pepe", "Pérez", "pepeperez@gmail.com", "12345pepe", 1200.50, 13), new Cliente(1L, "Antonio", "López", "12345678X", "Calatayud", "12345anto", 654789267, "antonlopez@gmail.com")),
				new Reforma(2, LocalDate.of(2021, 3, 7), LocalDate.of(2021, 5, 26), 6789.93, ),
				new Reforma(3, LocalDate.of(2023, 4, 1), LocalDate.of(2023, 4, 23), 2034.56)):
	}
}
