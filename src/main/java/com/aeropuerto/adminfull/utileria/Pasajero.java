package com.aeropuerto.adminfull.utileria;

import lombok.*;

import javax.persistence.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@Entity
public class Pasajero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBoleto;

    @Column
    private String Nombre;

    @Column
    private int Asiento;

    @ManyToOne
    private Vuelo vuelo;

	public void setVuelo(Vuelo vuelo2) {
	}


}
