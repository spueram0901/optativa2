package com.daw.persistence;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pedido")
@Getter
@Setter
@NoArgsConstructor

public class Pedido {
	
	private long id;
	private long idCliente;
	private LocalDateTime fecha;
	private double total;
	private String metodo;
	private String notas;

}
