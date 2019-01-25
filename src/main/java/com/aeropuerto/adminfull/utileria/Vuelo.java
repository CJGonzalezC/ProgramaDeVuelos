package com.aeropuerto.adminfull.utileria;

import lombok.*;

import javax.persistence.*;

@Data
@ToString
@NoArgsConstructor
//@RequiredArgsConstructor(staticName = "on")
@AllArgsConstructor
@Entity
public class Vuelo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVuelo;

    @Column
    private String Aeropuerto;

    @Column
    private String Aerolinea;

    @Column
    private String Ruta;

    public Vuelo(int idvuelo) {
        this.idVuelo = idvuelo;
    }


	public void setIdVuelo(int idvuelo) {
        this.idVuelo = idvuelo;
	}
}
