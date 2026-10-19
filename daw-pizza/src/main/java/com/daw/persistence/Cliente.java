package com.daw.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cliente")
@Getter
@Setter
@NoArgsConstructor
public class Cliente {
	
	private long id;
	private String nombre;
	private String direccion;
	private String email;
	private String telefono;
}
